package calculadora.tecsup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText contenedor,contenedor2;
    public boolean inicio=true,igual;
    private double resultado,valor,valor2;
    private String tipoOp;
    private Button FUNC;
    @Override
    @SuppressWarnings("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedor=findViewById(R.id.contenedor);
        contenedor2=findViewById(R.id.contenedor2);
        contenedor.setKeyListener(null);
        contenedor2.setKeyListener(null);
        contenedor2.setFocusable(false);
        contenedor2.setClickable(false);
        FUNC=findViewById(R.id.FUNC);
        FUNC.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                PopupMenu pmenu=new PopupMenu(getApplicationContext(),FUNC);
                pmenu.getMenuInflater().inflate(R.menu.popup_menu,pmenu.getMenu());
                pmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        valor=Double.parseDouble(contenedor.getText().toString());
                        switch (item.getItemId()){
                            case R.id.sen:
                                contenedor2.setText("sen ("+valor+")");
                                tipoOp="sen";
                                inicio=true;
                                igual=false;
                                break;
                            case R.id.cos:
                                contenedor2.setText("cos ("+valor+")");
                                tipoOp="cos";
                                inicio=true;
                                igual=false;
                                return true;

                            case R.id.sec:
                                contenedor2.setText("sec ("+valor+")");
                                tipoOp="sec";
                                inicio=true;
                                igual=false;
                                return true;

                            case R.id.csc:
                                contenedor2.setText("csc ("+valor+")");
                                tipoOp="csc";
                                inicio=true;
                                igual=false;
                                return true;

                            case R.id.tan:
                                contenedor2.setText("tan ("+valor+")");
                                tipoOp="tan";
                                inicio=true;
                                igual=false;
                                return true;
                            case R.id.cot:
                                contenedor2.setText("cot ("+valor+")");
                                tipoOp="cot";
                                inicio=true;
                                igual=false;
                                return true;
                        }
                        return false;
                    }
                }
                );
                pmenu.show();
                return false;
            }
        });
    }

    @SuppressWarnings("SetTextI18n")
    public void num1 (View view){

        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("1");
            inicio=false;
        }else {
            contenedor.setText(contenedor.getText()+"1");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num2 (View view){
        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("2");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"2");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num3 (View view){
        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("3");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"3");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num4 (View view){


        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("4");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"4");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num5 (View view){

        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("5");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"5");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num6 (View view){
        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("6");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"6");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num7 (View view){
        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("7");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"7");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num8 (View view){
        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("8");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"8");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num0 (View view) {
        if (inicio ) {
            contenedor.setText(" ");
            contenedor.setText("0");
            inicio = false;
        } else {
            contenedor.setText(contenedor.getText() + "0");
        }
    }

    @SuppressLint("SetTextI18n")
    public void num9 (View view){
        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("9");
            inicio=false;
        }else{
            contenedor.setText(contenedor.getText()+"9");
        }
    }

    @SuppressLint("SetTextI18n")
    public void punto (View view){
        if (contenedor.getText().toString().contains(".")){
        }else{
            contenedor.setText(contenedor.getText()+".");
            inicio=false;
        }
    }

    @SuppressLint("SetTextI18n")
    public void Suma (View view){
        igual=true;
        inicio=true;
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(" ");
        contenedor2.setText(contenedor.getText().toString()+"+");
        tipoOp="+";
    }

    @SuppressLint("SetTextI18n")
    public void Resta (View view){
        igual=true;
        inicio=true;
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(" ");
        contenedor2.setText(contenedor.getText().toString()+"-");
        tipoOp="-";
    }

    @SuppressLint("SetTextI18n")
    public void Producto (View view){

        igual=true;
        inicio=true;
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(" ");
        contenedor2.setText(contenedor.getText().toString()+"x");
        tipoOp="*";
    }

    @SuppressLint("SetTextI18n")
    public void Division (View view){
        igual=true;
        inicio=true;
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(" ");
        contenedor2.setText(contenedor.getText().toString()+"÷");
        tipoOp="/";
    }

    public void Signo (View view){

        double colector,numero1,numero2=0;
        colector=Double.parseDouble(contenedor.getText().toString());
        numero1=numero2-colector;
        contenedor.setText(String.valueOf(numero1));
    }

    public  void Borrartodo (View view){
        contenedor.setText("0");
        contenedor2.setText("");
        inicio=true;
        igual=true;
        valor=0;
        valor2=0;
        resultado=0;
    }

    public void Borrar(View view){
        if (contenedor.getText().length()>0){
            contenedor.setText(contenedor.getText().toString().substring(0,contenedor.getText().length()-1));
            if (contenedor.getText().length()==0){
                contenedor.setText("0");
                inicio=true;
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public void Raiz(View view){
        valor=Double.parseDouble(contenedor.getText().toString());
        if (valor>=0){
            contenedor2.setText("√("+valor+")");
            tipoOp="raiz";
            inicio=true;
            igual=false;
        }else{
            Toast.makeText(MainActivity.this,"Error de cálculo",Toast.LENGTH_SHORT).show();
            contenedor.setText("0");
            contenedor2.setText("");
            inicio=true;
        }
    }

    public void Salir (View view){
        AlertDialog.Builder Mensaje=new AlertDialog.Builder(MainActivity.this);
        Mensaje.setTitle("Calculadora");
        Mensaje.setMessage("¿Seguro que desea salir de la aplicación?");
        Mensaje.setPositiveButton("Salir", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
            });

        Mensaje.setNegativeButton("No", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
        contenedor.setText("0");
        inicio=true;
        }
            });
        Mensaje.show();
    }

@SuppressLint("SetTextI18n")
    public void Potencia(View view){
        inicio=true;
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(valor+"^");
        tipoOp="^";
        igual=true;
    }

    @SuppressLint("SetTextI18n")
    public void Igual (View view){
        inicio=true;
        if (igual=true){
            if (tipoOp ==null) {
                contenedor.setText("0");
            }
            else {
                valor2 = Double.parseDouble(contenedor.getText().toString());
                contenedor2.setText(contenedor2.getText().toString() + contenedor.getText().toString());
                resolver(valor, valor2);
                igual = false;
            }
        }
        else {
            resolver(valor, valor2);
        }
    }

    @SuppressLint("SetTextI18n")
    public void Cuadrado(View view){
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(valor+"^2");
        resultado=Math.pow(valor,2);
        contenedor.setText(String.valueOf(resultado));
    }

    @SuppressLint("SetTextI18n")
    public void resolver(Double valor1, Double valor2){
        switch (tipoOp){
            case "+":
                resultado=valor1+valor2;
                contenedor.setText(String.valueOf(resultado));
                break;
            case "-":
                resultado=valor1-valor2;
                contenedor.setText(String.valueOf(resultado));
                break;
            case "*":
                resultado=valor1*valor2;
                contenedor.setText(String.valueOf(resultado));
                break;
            case "/":
                if (valor2==0){
                    Toast.makeText(MainActivity.this,"Error de cálculo",Toast.LENGTH_SHORT).show();
                    contenedor.setText("0");
                    inicio=true;
                }else {
                    resultado = valor1 / valor2;
                    contenedor.setText(String.valueOf(resultado));
                    break;
                }
                break;
            case "^":
                resultado=Math.pow(valor1,valor2);
                contenedor.setText(String.valueOf(resultado));
                break;

            case "raiz":
                contenedor2.setText("√("+valor1+")");
                resultado=Math.sqrt(valor1);
                contenedor.setText(String.valueOf(resultado));
                break;

            case "sen":
                contenedor2.setText("sen ("+valor1+")");
                resultado=Math.sin(valor1);
                contenedor.setText(String.valueOf(resultado));
                break;
            case "cos":
                contenedor2.setText("cos ("+valor1+")");
                resultado=Math.cos(valor1);
                contenedor.setText(String.valueOf(resultado));
                break;
            case "tan":
                contenedor2.setText("tan ("+valor1+")");
                resultado=Math.tan(valor1);
                contenedor.setText(String.valueOf(resultado));
                break;
            case "cot":
                contenedor2.setText("cot ("+valor1+")");
                resultado=(1/(Math.tan(valor1)));
                contenedor.setText(String.valueOf(resultado));
                break;
            case "sec":
                contenedor2.setText("sec ("+valor1+")");
                resultado=1/(Math.cos(valor1));
                contenedor.setText(String.valueOf(resultado));
                break;
            case "csc":
                contenedor2.setText("csc ("+valor1+")");
                resultado=1/(Math.sin(valor1));
                contenedor.setText(String.valueOf(resultado));
                break;
        }
    }
}

