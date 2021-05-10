/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package akademik;

/**
 *
 * @Fariz Iskandar
 */
class akademik {
    void akademik(){
        System.out.println("daftar mahasiswa");
    }

    void nama() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void nimp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void nilai() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void progdip() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void matkulp() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void dsn() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

class mahasiswa extends akademik{
    @Override
    void nama(){
        System.out.println("NAMA: Fariz Iskandar");
    }
}

class nim extends akademik{
    @Override
    void nimp(){
        System.out.println("NIM: A11.2019.12205");
    }
}

class transkip extends akademik{
    @Override
    void nilai(){
        System.out.println("N.TINGGI: 85");
        System.out.println("N.RENDAH: 75");
    }
}

class progdi extends akademik{
    @Override
    void progdip(){
        System.out.println("PROGDI: Teknik Informatika");
    }
}

class matkul extends akademik{
    @Override
    void matkulp(){
        System.out.println("MATKUL: Pemrograman Berorientasi Objek");
    }
}

class dosenn extends akademik{
    @Override
    void dsn(){
        System.out.println("DOSEN: Ardiawan Bagus");
    }
}

class demo {
    public static void main (String[] args){
        
        akademik h = new mahasiswa();
        h.nama();
        
        akademik a = new nim();
        a.nimp();
        
        akademik b = new transkip();
        b.nilai();
        
        akademik z = new progdi();
        z.progdip();
        
        akademik x = new matkul();
        x.matkulp();
        
        akademik k = new dosenn();
        k.dsn();
    }
}