package calculadora.tecsup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public EditText contenedor,contenedor2;
    public boolean inicio=true,igual,op1,op2;
    public double resultado,valor,valor2;
    public String funciones,tipoOp;
    public Button FUNC;
    public DecimalFormat decimal=new DecimalFormat("0.000");
    @Override
    @SuppressWarnings("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contenedor=findViewById(R.id.contenedor);
        contenedor2=findViewById(R.id.contenedor2);
        FUNC=findViewById(R.id.FUNC);

    }

    @SuppressWarnings("SetTextI18n")
    public void num1 (View view){



        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("1");
            inicio=false;
        }else{
            //noinspection AndroidLintSetTextI18n
            contenedor.setText(contenedor.getText()+"1");
        }
    }
    public void num2 (View view){


        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("2");
            inicio=false;
        }else{
            //noinspection AndroidLintSetTextI18n
            contenedor.setText(contenedor.getText()+"2");
        }
    }

    public void num3 (View view){


        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("3");
            inicio=false;
        }else{
            //noinspection AndroidLintSetTextI18n
            contenedor.setText(contenedor.getText()+"3");
        }
    }
    public void num4 (View view){


        if (inicio){
            contenedor.setText(" ");
            contenedor.setText("4");
            inicio=false;
        }else{
            //noinspection AndroidLintSetTextI18n
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
            System.out.println("No hacer nada");
        }else{
            contenedor.setText(contenedor.getText()+".");
            inicio=false;
        }
    }

    @SuppressLint("SetTextI18n")
    public void Suma (View view){
        igual=true;
        inicio=true;
        if (op1=true){
            valor=Double.parseDouble(contenedor.getText().toString());
            contenedor2.setText(" ");
            contenedor2.setText(contenedor.getText().toString()+"+");
            op1=false;
        }else {
            if (op2=true){
                valor=Double.parseDouble(contenedor.getText().toString());
                contenedor2.setText(" ");
                contenedor2.setText(contenedor.getText().toString()+"+");
                op2=false;
            }else {
                contenedor2.setText(contenedor.getText()+"+");
                resolver(resultado,valor2);
            }
        }
        tipoOp="+";
    }

    @SuppressLint("SetTextI18n")
    public void Resta (View view){

        igual=true;
        inicio=true;
        if (op1=true){
            valor=Double.parseDouble(contenedor.getText().toString());
            contenedor2.setText(" ");
            contenedor2.setText(contenedor.getText().toString()+"-");
            op1=false;
        }else {
            if (op2=true){
                valor=Double.parseDouble(contenedor.getText().toString());
                contenedor2.setText(" ");
                contenedor2.setText(contenedor.getText().toString()+"-");
                op2=false;
            }else{
                contenedor2.setText(contenedor.getText()+"-");
                resolver(resultado,valor2);
            }
        }
        tipoOp="-";
    }
    @SuppressLint("SetTextI18n")
    public void Producto (View view){

        igual=true;
        inicio=true;
        if (op1=true){
            valor=Double.parseDouble(contenedor.getText().toString());
            contenedor2.setText(" ");
            contenedor2.setText(contenedor.getText().toString()+"x");
            op1=false;
        }else{
            if (op2=true){
                valor=Double.parseDouble(contenedor.getText().toString());
                contenedor2.setText(" ");
                contenedor2.setText(contenedor.getText().toString()+"x");
                op2=false;
            }else{
                contenedor2.setText(contenedor.getText()+"x");
                resolver(resultado,valor2);
            }
        }
        tipoOp="*";
    }

    @SuppressLint("SetTextI18n")
    public void Division (View view){
        igual=true;
        inicio=true;
        if (op1=true){
            valor=Double.parseDouble(contenedor.getText().toString());
            contenedor2.setText(" ");
            contenedor2.setText(contenedor.getText().toString()+"/");
            op1=false;
        }else{
            if (op2=true){
                valor=Double.parseDouble(contenedor.getText().toString());
                contenedor2.setText(" ");
                contenedor2.setText(contenedor.getText().toString()+"/");
                op2=false;
            }else{
                contenedor2.setText(contenedor.getText()+"/");
                resolver(resultado,valor2);
            }
        }
        tipoOp="/";

    }

    @SuppressLint("SetTextI18n")
    public void Igual (View view){

        inicio=true;
        op1=true;
        if (igual=true) {
            if (tipoOp == null) {
            } else {
                valor2 = Double.parseDouble(contenedor.getText().toString());
                contenedor2.setText(contenedor2.getText().toString() + contenedor.getText().toString());
                resolver(valor, valor2);
                igual = false;
            }
        }else {
            contenedor2.setText("");
            resolver(valor,valor2);

        }
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
        funciones="";
        op1=true;
        op2=true;
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
    public void Potencia(View view){
        inicio=true;
        valor=Double.parseDouble(contenedor.getText().toString());
        contenedor2.setText(valor+"^");
        tipoOp="^";
        op1=false;
        igual=false;
    }

    @SuppressLint("SetTextI18n")
    public void Raiz(View view){
        valor=Double.parseDouble(contenedor.getText().toString());
        if (valor>=0){
            contenedor2.setText("√("+valor+")");
            tipoOp="raiz";
            inicio=true;
            op2=false;
            op1=false;
            igual=false;
        }else{
            contenedor.setText("Error de cálculo");
        }
    }
    public void Salir (View view){
        finish();
    }





    @SuppressLint("SetTextI18n")
    public void resolver(Double va1, Double va2){

        switch (tipoOp){

            case "+":
                resultado=va1+va2;
                contenedor.setText(String.valueOf(resultado));
                break;
            case "-":
                resultado=va1-va2;
                contenedor.setText(String.valueOf(resultado));
                break;
            case "*":
                resultado=va1*va2;
                contenedor.setText(String.valueOf(resultado));
                break;
            case "/":
                if (va2==0){
                    contenedor.setText("Error de división");
                }else {
                    resultado = va1 / va2;
                    contenedor.setText(String.valueOf(resultado));
                    break;
                }

            case "^":
                resultado=Math.pow(valor,valor2);
                contenedor.setText(String.valueOf(resultado));
                break;
            case "raiz":
                resultado=Math.sqrt(valor);
                contenedor.setText(String.valueOf(resultado));
                break;
        }
    }


}






