package sandicaesar;

/**
 *
 * @author Mika'el Zakaria
 * 18.44 26/09/2020 
 * East Java, Lamongan
 * 
 * Ini Merupakan Program Enkripsi-Dekripsi Sederhana Menggunakan Metode Sandi Caesar Menggunakan Shifter Angka
 * Contoh : Jika Kata 'Zaka' di beri kunci 1(satu) maka hasil enkripsi yaitu 'Ablb'
 *          Jika Kata 'Aan' di beri kunci 1(satu) maka hasil enkripsi yaitu 'Bbo'
 * 
 */

public class SandiCaesar{
    
    //Method For Encrypt With 2 Paramaters Input And Modulo(for Key)
    public String enkripsi(String input, int modulo){
        String output = "";
        char ubah;
        
        //Looping untuk membaca semua huruf dari inputan
        for(int i=0; i<input.length(); i++){
            //Memasukkan Huruf(Char) dari inputan ke variabel ubah
            ubah = input.charAt(i);
            
            //Kondisi apabila huruf merupakan a - z (huruf Kecil) 
            if(ubah >= 'a' && ubah <= 'z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet a - z
                ubah += modulo%26;
                
                //Kondisi apabila huruf melebihi nilai ASCII dari 'z'(Kecil)
                if(ubah > 'z'){
                    
                    //Mengurangi nilai ASCII dari variabel ubah
                    ubah -= 26;
                }
                
            //Kondisi apabila huruf merupakan A - Z (huruf Kapital)
            }else if(ubah >= 'A' && ubah <= 'Z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet A-Z
                ubah += modulo%26;
                
                //Kondisi apabila huruf melebihi nilai ASCII dari 'Z'
                if(ubah > 'Z'){
                    
                    //Mengurangi nilai ASCII dari variabel ubah
                    ubah -= 26;
                }
            }
            
            //Mengisi String Output dengan char dari variabel Ubah 
            output += ubah;
        }
        return output;
    }
    
    //Method For Decrypt With 2 Paramaters Input And Modulo(for Key)
    public String dekripsi(String input, int modulo){
        String output = "";
        char ubah;
        
        //Looping untuk membaca semua huruf dari inputan
        for(int i=0; i<input.length(); i++){
            
            //Memasukkan Huruf(Char) dari inputan ke variabel ubah
            ubah = input.charAt(i);
            
            //Kondisi apabila huruf merupakan a - z (huruf Kecil)
            if(ubah >= 'a' && ubah <= 'z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet a - z
                ubah -= modulo%26;
                
                //Kondisi apabila huruf kurang dari nilai ASCII dari 'a'(Kecil)
                if(ubah < 'a'){
                    
                    //Menambah nilai ASCII dari variabel ubah
                    ubah += 26;
                }
                
            //Kondisi apabila huruf merupakan A - Z (huruf Kapital)    
            }else if(ubah >= 'A' && ubah <= 'Z'){
                
                //Modulo 26 digunakan untuk panjang huruf Alphabet A - Z
                ubah -= modulo%26;
                
                //Kondisi apabila huruf kurang dari nilai ASCII dari 'A'(Kapital)
                if(ubah < 'A'){
                    
                    //Menambah nilai ASCII dari variabel ubah
                    ubah += 26;
                }
            }
            
            //Mengisi String Output dengan char dari variabel Ubah
            output += ubah;
        }
        return output;
    }
}