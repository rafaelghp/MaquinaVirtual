package com.maquina_virtual;
import java.util.List;

public class Operadores {

    public static int JMP (int k) {
        return k;
    }

    public static int JMPI (int Rs) {
        return Rs;
    }

    public static int JMPIG (int Rc,  int Rs, int Pc) {
        return Rc > 0 ? Rs : Pc++;
    }

    public static int JMPIL (int Rc,  int Rs, int Pc) {
        return Rc < 0 ? Rs : Pc++;
    }

    public static int JMPIE (int Rc,  int Rs, int Pc) {
        return Rc == 0 ? Rs : Pc++;
    }

    public static double ADDI (double Rd,  double k) {
        return Rd + k;
    }

    public static double SUBI (double Rd,  double k) {
        return Rd - k;
    }

    public static boolean ANDI (boolean Rd,  boolean k) {
        return Rd && k;
    }

    public static boolean ORI (boolean Rd,  boolean k) {
        return Rd || k;
    }

    public static double LDI (double k) {
        return k;
    }

    public static double LDD (int a, List<Object> x) {
        return (double) x.get(a);
    }

    public static void STD (double Rs, int a, List<Object> x) {
        x.add(a, Rs);
    }

    public static double ADD (double Rd,  double Rs) {
        return Rd + Rs;
    }

    public static double SUB (double Rd,  double Rs) {
        return Rd - Rs;
    }

    public static double MULT (double Rd,  double Rs) {
        return Rd * Rs;
    }

    public static boolean AND(boolean Rd, boolean Rs) {
        return Rd && Rs;
    }

    public static boolean OR (boolean Rd, boolean Rs) {
        return Rd || Rs;
    }

    public static double LDX (int Rs, List<Object> x) {
        return (double) x.get(Rs);
    }

    public static void STX (int Rd, double Rs, List<Object> x) {
        x.add(Rd, Rs);
    }

    public static boolean NOT(boolean Rd) {
        return Rd?false:true;
    }

    public void STOP(){
        System.exit(0);
    }
} 