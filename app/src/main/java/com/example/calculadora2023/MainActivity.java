package com.example.calculadora2023;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigInteger;




public class MainActivity extends AppCompatActivity {


    private Button boton_0,boton_1, boton_2, boton_3,boton_4, boton_5,boton_6,boton_7,boton_8,boton_9,boton_A,boton_B,
            boton_info,boton_C,boton_D,boton_E,boton_F,botonBI,botonOCT,botonDEC, botonHEX,
            boton_Dividir,boton_Multiplicar,boton_Sumar,boton_Restar,boton_Calcular, clean, botonN1, botonN2;
            double num1,num2,result;
            TextView resultado,NN1,NN2,signo;
            String operador,sistema;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonN1 = findViewById(R.id.n1);
        botonN2 = findViewById(R.id.n2);
        botonBI = findViewById(R.id.boton_BI);
        botonOCT = findViewById(R.id.boton_OCT);
        botonDEC = findViewById(R.id.boton_DEC);
        botonHEX = findViewById(R.id.boton_HEX);
        boton_0 = findViewById(R.id.boton0);
        boton_1 = findViewById(R.id.boton1);
        boton_2 = findViewById(R.id.boton2);
        boton_3 = findViewById(R.id.boton3);
        boton_4 = findViewById(R.id.boton4);
        boton_5 = findViewById(R.id.boton5);
        boton_6 = findViewById(R.id.boton6);
        boton_7 = findViewById(R.id.boton7);
        boton_8 = findViewById(R.id.boton8);
        boton_9 = findViewById(R.id.boton9);
        boton_A = findViewById(R.id.botonA);
        boton_B = findViewById(R.id.botonB);
        boton_C = findViewById(R.id.botonC);
        boton_D = findViewById(R.id.botonD);
        boton_E = findViewById(R.id.botonE);
        boton_F = findViewById(R.id.botonF);
        boton_Dividir = findViewById(R.id.botonDivisor);
        boton_Multiplicar = findViewById(R.id.botonMultiplicar);
        boton_Sumar = findViewById(R.id.botonSumar);
        boton_Restar = findViewById(R.id.botonRestar);
        boton_Calcular = findViewById(R.id.botonCalcular);
        clean = findViewById(R.id.boton_Clean);
        boton_info = findViewById(R.id.informacion);
        resultado=(TextView) findViewById(R.id.resultado);
        signo=(TextView) findViewById(R.id.signo);
        NN1 = (TextView)findViewById(R.id.N1);
        NN2 = (TextView)findViewById(R.id.N2);

///// botn N1
        botonN1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                boton_0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"0");

                    }
                });
                boton_1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"1");

                    }
                });
                boton_2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"2");

                    }
                });
                boton_3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"3");

                    }
                });
                boton_4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"4");

                    }
                });
                boton_5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"5");

                    }
                });
                boton_6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"6");

                    }
                });
                boton_7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"7");

                    }
                });
                boton_8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"8");

                    }
                });
                boton_9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"9");

                    }
                });
                boton_A.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"a");

                    }
                });
                boton_B.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"b");
                    }
                });
                boton_C.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"c");
                    }
                });
                boton_D.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"d");
                    }
                });
                boton_E.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+'e');
                    }
                });
                boton_F.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN1.setText(NN1.getText().toString()+"f");
                    }
                });


///////// HASTA AQUI
            }
        });


///// botn N2

        botonN2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                boton_0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"0");

                    }
                });
                boton_1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"1");

                    }
                });
                boton_2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"2");

                    }
                });
                boton_3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"3");

                    }
                });
                boton_4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"4");

                    }
                });
                boton_5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"5");

                    }
                });
                boton_6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"6");

                    }
                });
                boton_7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"7");

                    }
                });
                boton_8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"8");

                    }
                });
                boton_9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"9");

                    }
                });
                boton_A.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"a");

                    }
                });
                boton_B.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"b");
                    }
                });
                boton_C.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"c");
                    }
                });
                boton_D.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"d");
                    }
                });
                boton_E.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"e");
                    }
                });
                boton_F.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {

                        NN2.setText(NN2.getText().toString()+"f");
                    }
                });

            }
        });
//// OTROS BOTONES


        boton_Sumar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operador="+";
                num1=Double.parseDouble(NN1.getText().toString());
                resultado.setText("");
                signo.setText("+");
            }
        });
        boton_Restar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operador="-";
                num1=Double.parseDouble(NN1.getText().toString());
                resultado.setText("");
                signo.setText("-");
            }
        });

        boton_Multiplicar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operador="*";
                num1=Double.parseDouble(NN1.getText().toString());
                resultado.setText("");
                signo.setText("*");
            }
        });
        boton_Dividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                operador="/";
                num1=Double.parseDouble(NN1.getText().toString());
                resultado.setText("");
                signo.setText("/");
            }
        });
        clean.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                NN1.setText("");
                signo.setText("");
                NN2.setText("");
                resultado.setText("");
            }
            /// BOTON INFORMACION
        });

        boton_info.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,Informacion.class);
                startActivity(i);
            }
        });



        botonBI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton_2.setVisibility(View.GONE);
                boton_3.setVisibility(View.GONE);
                boton_4.setVisibility(View.GONE);
                boton_5.setVisibility(View.GONE);
                boton_6.setVisibility(View.GONE);
                boton_7.setVisibility(View.GONE);
                boton_8.setVisibility(View.GONE);
                boton_9.setVisibility(View.GONE);
                boton_A.setVisibility(View.GONE);
                boton_B.setVisibility(View.GONE);
                boton_C.setVisibility(View.GONE);
                boton_D.setVisibility(View.GONE);
                boton_E.setVisibility(View.GONE);
                boton_F.setVisibility(View.GONE);
                sistema="BI";
            }


        });

        botonOCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton_0.setVisibility(View.VISIBLE);
                boton_1.setVisibility(View.VISIBLE);
                boton_2.setVisibility(View.VISIBLE);
                boton_3.setVisibility(View.VISIBLE);
                boton_4.setVisibility(View.VISIBLE);
                boton_5.setVisibility(View.VISIBLE);
                boton_6.setVisibility(View.VISIBLE);
                boton_7.setVisibility(View.VISIBLE);
                boton_8.setVisibility(View.GONE);
                boton_9.setVisibility(View.GONE);
                boton_A.setVisibility(View.GONE);
                boton_B.setVisibility(View.GONE);
                boton_C.setVisibility(View.GONE);
                boton_D.setVisibility(View.GONE);
                boton_E.setVisibility(View.GONE);
                boton_F.setVisibility(View.GONE);
                sistema="OCTA";
            }
        });

        botonDEC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton_0.setVisibility(View.VISIBLE);
                boton_1.setVisibility(View.VISIBLE);
                boton_2.setVisibility(View.VISIBLE);
                boton_3.setVisibility(View.VISIBLE);
                boton_4.setVisibility(View.VISIBLE);
                boton_5.setVisibility(View.VISIBLE);
                boton_6.setVisibility(View.VISIBLE);
                boton_7.setVisibility(View.VISIBLE);
                boton_8.setVisibility(View.VISIBLE);
                boton_9.setVisibility(View.VISIBLE);
                boton_A.setVisibility(View.GONE);
                boton_B.setVisibility(View.GONE);
                boton_C.setVisibility(View.GONE);
                boton_D.setVisibility(View.GONE);
                boton_E.setVisibility(View.GONE);
                boton_F.setVisibility(View.GONE);
                sistema="DEC";
            }


        });
        botonHEX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boton_0.setVisibility(View.VISIBLE);
                boton_1.setVisibility(View.VISIBLE);
                boton_2.setVisibility(View.VISIBLE);
                boton_3.setVisibility(View.VISIBLE);
                boton_4.setVisibility(View.VISIBLE);
                boton_5.setVisibility(View.VISIBLE);
                boton_6.setVisibility(View.VISIBLE);
                boton_7.setVisibility(View.VISIBLE);
                boton_8.setVisibility(View.VISIBLE);
                boton_9.setVisibility(View.VISIBLE);
                boton_A.setVisibility(View.VISIBLE);
                boton_B.setVisibility(View.VISIBLE);
                boton_C.setVisibility(View.VISIBLE);
                boton_D.setVisibility(View.VISIBLE);
                boton_E.setVisibility(View.VISIBLE);
                boton_F.setVisibility(View.VISIBLE);

                sistema="HEXA";
            }
        });


        boton_Calcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

               num2=Double.parseDouble(NN2.getText().toString());
                if (operador.equals("+")){
                    //resultado.setText("");
                    if (sistema.equals("BI")){
                        //result=num1-num2;
                        String bin1 =NN1.getText().toString() ;
                        String bin2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(bin1, 2);
                        BigInteger num2 = new BigInteger(bin2, 2);
                        BigInteger suma = num1.add(num2);

                        String resultadoSuma = suma.toString(2);
                        resultado.setText("Suma: " + resultadoSuma);
                    }
                    if (sistema.equals("OCTA")){
                        String oct1 =NN1.getText().toString() ;
                        String oct2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(oct1, 8);
                        BigInteger num2 = new BigInteger(oct2, 8);
                        BigInteger suma = num1.add(num2);
                        String resultadoSuma = suma.toString(8);
                        resultado.setText(resultadoSuma);

                    }
                    if (sistema.equals("DEC")){
                        result=num1+num2;
                        resultado.setText(String.valueOf(result));
                    }
                    if (sistema.equals("HEXA")){
                        String hex1 =NN1.getText().toString() ;
                        String hex2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(hex1, 16);
                        BigInteger num2 = new BigInteger(hex2, 16);
                        BigInteger suma = num1.add(num2);
                        String resultadoSuma = suma.toString(16);
                        resultado.setText(resultadoSuma);
                    }

                }


                if (operador.equals("-")){
                    resultado.setText("");
                    if (sistema.equals("BI")){
                        //result=num1-num2;
                        String bin1 =NN1.getText().toString() ;
                        String bin2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(bin1, 2);
                        BigInteger num2 = new BigInteger(bin2, 2);
                        BigInteger resta = num1.subtract(num2);
                        String resultadoResta = resta.toString(2);
                         resultado.setText("Resta: " + resultadoResta);
                    }
                    if (sistema.equals("OCTA")){

                        String oct1 =NN1.getText().toString() ;
                        String oct2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(oct1, 8);
                        BigInteger num2 = new BigInteger(oct2, 8);
                        BigInteger resta = num1.subtract(num2);
                        String resultadoResta  = resta.toString(8);
                        resultado.setText(resultadoResta );
                    }
                    if (sistema.equals("DEC")){
                        result=num1-num2;
                        resultado.setText(String.valueOf(result));
                    }
                    if (sistema.equals("HEXA")){
                        String hex1 =NN1.getText().toString() ;

                        String hex2 = NN2.getText().toString();

                        BigInteger num1 = new BigInteger(hex1, 16);
                        BigInteger num2 = new BigInteger(hex2, 16);
                        BigInteger resta = num1.subtract(num2);
                        String resultadoResta = resta.toString(16);
                        resultado.setText(resultadoResta);
                    }

                }


                if (operador.equals("*")){
                    resultado.setText("");
                    if (sistema.equals("BI")){
                        String oct1 =NN1.getText().toString() ;
                        String oct2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(oct1, 2);
                        BigInteger num2 = new BigInteger(oct2, 2);
                        BigInteger multiplicacion   = num1.multiply(num2);
                        String resultadoMultiplicacion  = multiplicacion .toString(2);
                        resultado.setText(resultadoMultiplicacion );
                    }
                    if (sistema.equals("OCTA")){

                        String oct1 =NN1.getText().toString() ;
                        String oct2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(oct1, 8);
                        BigInteger num2 = new BigInteger(oct2, 8);
                        BigInteger multiplicacion = num1.multiply(num2);
                        String resultadoMultiplicacion  = multiplicacion.toString(8);
                        resultado.setText(resultadoMultiplicacion);
                    }
                    if (sistema.equals("DEC")){
                        result=num1*num2;
                        resultado.setText(String.valueOf(result));
                    }
                    if (sistema.equals("HEXA")){
                        String hex1 =NN1.getText().toString() ;
                        String hex2 = NN2.getText().toString();
                        BigInteger num1 = new BigInteger(hex1, 16);
                        BigInteger num2 = new BigInteger(hex2, 16);
                        BigInteger multiplicacion = num1.multiply(num2);
                        String resultadoMultiplicacion = multiplicacion.toString(16);
                        resultado.setText(resultadoMultiplicacion);
                    }
                }


                if (operador.equals("/")){
                    resultado.setText("");
                    if(num2!=0){
                        if (sistema.equals("BI")){
                            String bin1 =NN1.getText().toString() ;
                            String bin2 = NN2.getText().toString();
                            BigInteger num1 = new BigInteger(bin1, 2);
                            BigInteger num2 = new BigInteger(bin2, 2);
                            BigInteger division   = num1.divide(num2);
                            String resultadoDivision  = division  .toString(2);
                            resultado.setText( resultadoDivision );
                        }
                        if (sistema.equals("OCTA")){
                            String bin1 =NN1.getText().toString() ;
                            String bin2 = NN2.getText().toString();
                            String oct1 =NN1.getText().toString() ;
                            String oct2 = NN2.getText().toString();
                            BigInteger num1 = new BigInteger(oct1, 8);
                            BigInteger num2 = new BigInteger(oct2, 8);
                            BigInteger division = num1.divide(num2);
                            String resultadoDivision  = division.toString(8);
                            resultado.setText(resultadoDivision );
                        }
                        if (sistema.equals("DEC")){
                            result=num1/num2;
                            resultado.setText(String.valueOf(result));
                        }
                        if (sistema.equals("HEXA")){
                            String hex1 =NN1.getText().toString() ;
                            String hex2 = NN2.getText().toString();
                            BigInteger num1 = new BigInteger(hex1, 16);
                            BigInteger num2 = new BigInteger(hex2, 16);
                            BigInteger division = num1.divide(num2);
                            String resultadoDivision = division.toString(16);
                            resultado.setText(resultadoDivision);
                        }

                    }
                }

            }
        });



    }



}
