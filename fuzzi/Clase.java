/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzi;

/**
 *
 * @author Cristian M
 */
public class Clase  {
    private int min,max;
    public Interfaz okey = new Interfaz();
	
	//Error negativo grande
	public double eng( double entrada){
		if(entrada<-10){
			return 1;
		}
		else{
			if(entrada>=-10 && entrada<-5){
				return (-.2*entrada)-1;
			}
			else{
				return 0;
			}
		}
	}
	//Error negativo pequeño
	public double enp(double entrada){
		
		if(entrada<-10){
			return 0;
		}
		else{
			if(entrada>=-10 && entrada<-5){
				return (.2*entrada)+2;
			}
			else{
				if(entrada>=-5 && entrada<0){
					return (-.2*entrada);
				}
				else{
					return 0;
				}
			}
		}
	}
	//error medio 0
	public  double ez(double entrada){
		if(entrada<-5){
			return 0;
		}
		else{
			if(entrada>=-5 && entrada<0){
				return (.2*entrada)+1;
			}
			else{
				if(entrada>=0 && entrada<5){
					return (-.2*entrada)+1;
				}
				else{
					return 0;
				}
			}
		}
	}
	//error positivo pequeño
	public  double epp(double entrada){
			if(entrada<0){
				return 0;
			}
			else{
				if(entrada>=0 && entrada<5){
					return (.2*entrada);
				}
				else{
					if(entrada>=5 && entrada<10){
						return (-.2*entrada)+2;
					}
					else{
						return 0;
					}
				}
			}
	}
	//error positivo grande
	public  double epg(double entrada){	
		if( entrada<5){
			return 0;
		}
		else{
			if(entrada>=5 && entrada<10){
				return (.2*entrada)-1;
			}
			else{
				return 1;
			}
		}
	}

	
	////////////////////////////////////////
	
	// error diferencial 
	
	//Error negativo grande
	public double deng( double entrada){
		if(entrada<-4){
			return 1;
		}
		else{
			if(entrada>=-4 && entrada<-2){
				return (-.5*entrada)-1;
			}
			else{
				return 0;
			}
		}
	}
	//Error negativo pequeño
	public double denp(double entrada){
		
		if(entrada<-4){
			return 0;
		}
		else{
			if(entrada>=-4 && entrada<-2){
				return (.5*entrada)+2;
			}
			else{
				if(entrada>=-2 && entrada<0){
					return (-.5*entrada);
				}
				else{
					return 0;
				}
			}
		}
	}
	//error medio 0
	public  double dez(double entrada){
		if(entrada<-2){
			return 0;
		}
		else{
			if(entrada>=-2 && entrada<0){
				return (.5*entrada)+1;
			}
			else{
				if(entrada>=0 && entrada<2){
					return (-.5*entrada)+1;
				}
				else{
					return 0;
				}
			}
		}
	}
	//error positivo pequeño
	public  double depp(double entrada){
			if(entrada<0){
				return 0;
			}
			else{
				if(entrada>=0 && entrada<2){
					return (.5*entrada);
				}
				else{
					if(entrada>=2 && entrada<4){
						return (-.5*entrada)+2;
					}
					else{
						return 0;
					}
				}
			}
	}
	//error positivo grande
	public  double depg(double entrada){	
		if( entrada<2){
			return 0;
		}
		else{
			if(entrada>=2 && entrada<4){
				return (.5*entrada)-1;
			}
			else{
				return 1;
			}
		}
	}
	
	//diferencial de error
	public  double diferencial(double derror, double error){
		if(eng(error)!=0){
				if(deng(derror)!=0){
                                      // okey.area.setText(String.valueOf("SNG "+eng(error)*deng(derror) ));
					System.out.println("SNG " + eng(error)*deng(derror));
				} 
				if(denp(derror)!=0){
                                        //okey.area.setText(String.valueOf("SNG "+ eng(error)*denp(derror) ));
					System.out.println("SNG "+ eng(error)*denp(derror));
				}
				if((dez(derror))!=0){
                                     //okey.area.setText(String.valueOf("SNG "+ eng(error)*dez(derror) ));
					System.out.println("SNG " + eng(error)*dez(derror));
				}
				if((depp(derror))!=0){
                                    okey.jTextField1.setText(String.valueOf("SPG "+ eng(error)*depp(derror) ));
					System.out.println("SPG " + eng(error)*depp(derror));
				}
				if((depg(derror))!=0){
                                    okey.jTextField2.setText(String.valueOf("SPG "+ eng(error)*depg(derror) ));
					System.out.println("SPG " + eng(error)*depg(derror));
				}
			}
			if(enp(error)!=0){
				if(deng(derror)!=0){
                                   // okey.area.setText(String.valueOf("SNP "+ enp(error)*deng(derror) ));
					System.out.println("SNP " + enp(error)*deng(derror));
				}
				if(denp(derror)!=0){
                                    //okey.area.setText(String.valueOf("SNP "+ enp(error)*denp(derror) ));
					System.out.println("SNP " + enp(error)*denp(derror));
				}
				if((dez(derror))!=0){
                                    //okey.area.setText(String.valueOf("SNP "+ enp(error)*dez(derror) ));
					System.out.println("SNP " + enp(error)*dez(derror));
				}
				if((depp(derror))!=0){
                                    //okey.area.setText(String.valueOf("SPP "+ enp(error)*depp(derror) ));
					System.out.println("SPP " + enp(error)*depp(derror));
				}
				if((depg(derror))!=0){
                                    okey.jTextField3.setText(String.valueOf("SPG "+ enp(error)*depp(derror) ));
					System.out.println("SPG " + enp(error)*depg(derror));
				}
				 
			}
			if(ez(error)!=0){
				if(deng(derror)!=0){
                                    //okey.area.setText(String.valueOf("SNP "+ ez(error)*deng(derror) ));
					System.out.println("SNP "+ ez(error)*deng(derror));
				}
				if(denp(derror)!=0){
                                    //okey.area.setText(String.valueOf("SNP "+ ez(error)*denp(derror) ));
					System.out.println("SNP "+ ez(error)*denp(derror));
				}
				if((dez(derror))!=0){
                                    //okey.area.setText(String.valueOf("SZ "+ ez(error)*dez(derror) ));
					System.out.println("SZ " +ez(error)*dez(derror));
				}
				if((depp(derror))!=0){
                                    //okey.area.setText(String.valueOf("SPP "+ ez(error)*depp(derror) ));
					System.out.println("SPP "+ez(error)*depp(derror));
				}
				if((depg(derror))!=0){
                                    okey.jTextField4.setText(String.valueOf("SPP "+ ez(error)*depg(derror) ));
					System.out.println("SPP "+ez(error)*depg(derror));
				}
			}
			if(epp(error)!=0){
				if(deng(derror)!=0){
                                    //okey.area.setText(String.valueOf("SNP "+ epp(error)*deng(derror) ));
					System.out.println("SNP "+epp(error)*deng(derror));
				}
				if(denp(derror)!=0){
                                    //okey.area.setText(String.valueOf("SNP "+ epp(error)*denp(derror) ));
					System.out.println("SNP "+epp(error)*denp(derror));
				}
				if((dez(derror))!=0){
                                    //okey.area.setText(String.valueOf("SPP "+ epp(error)*dez(derror) ));
					System.out.println("SPP "+epp(error)*dez(derror));
				}
				if((depp(derror))!=0){
                                    //okey.area.setText(String.valueOf("SPP "+ epp(error)*depp(derror) ));
					System.out.println("SPP "+epp(error)*depp(derror));
				}
				if((depg(derror))!=0){
                                    okey.jTextField5.setText(String.valueOf("SPP "+ epp(error)*depg(derror) ));
					System.out.println("SPP "+epp(error)*depg(derror));
				}
			}
			if(epg(error)!=0){
				if(deng(derror)!=0){
                                //    okey.area.setText(String.valueOf("SNG "+ epg(error)*deng(derror) ));
					System.out.println("SNG " +epg(error)*deng(derror));
				}
				if(denp(derror)!=0){
                                  //  okey.area.setText(String.valueOf("SNG "+ epg(error)*denp(derror) ));
					System.out.println("SNG "+epg(error)*denp(derror));
				}
				if((dez(derror))!=0){
                                    //okey.area.setText(String.valueOf("SPG "+ epg(error)*dez(derror) ));
					System.out.println("SPG "+epg(error)*dez(derror));
				}
				if((depp(derror))!=0){
                                    //okey.area.setText(String.valueOf("SPG "+ epg(error)*depp(derror) ));
					System.out.println("SPG "+epg(error)*depp(derror));
				}
				if((depg(derror))!=0){
                                    okey.jTextField6.setText(String.valueOf("SPP "+ epg(error)*depg(derror) ));
					System.out.println("SPP "+epg(error)*depg(derror));
				}
			}
					
			//double spg = ( epg(error)*dez(derror) + epg(error)*depp(derror) + enp(error)*depg(derror) + eng(error)*depg(derror) + eng(error)*depp(derror));
		// }
		
		return 0;	
	}
	
	//sumas
	public double spg (double derror , double error){
		return  epg(error)*dez(derror) + epg(error)*depp(derror) + enp(error)*depg(derror) + eng(error)*depg(derror) + eng(error)*depp(derror);
	}
	public double spp(double derror , double error){
		return epg(error)*depg(derror) + epp(error)*depg(derror) + epp(error)*depp(derror) + epp(error)*dez(derror) + ez(error)*depg(derror) + ez(error)*depp(derror) + enp(error)*depp(derror);
	}
	public double sz(double derror , double error){
		return ez(error)*dez(derror);
	}
	public double snp(double derror , double error){
	
		return epp(error)*denp(derror) + epp(error)*deng(derror) +ez(error)*denp(derror)+ ez(error)*deng(derror)+enp(error)*dez(derror)+enp(error)*denp(derror)+enp(error)*deng(derror);
	}
	public double sng(double derror , double error){
		return epg(error)*denp(derror) + epg(error)*deng(derror)+ eng(error)*dez(derror)+eng(error)*denp(derror)+eng(error)*deng(derror);
	}
	
	//centroide
	public double centroide (double x, double y){
		double mspg = spg(x, y)* 10;
		double mspp = spp(x, y)* 5;
		double msz = sz(x, y)*0;
		double msnp = snp(x, y) * -5;
		double msng = sng(x, y) * -10;
		double suma=spg(x, y) + spp(x, y) + sz(x, y) + snp(x, y) +sng(x, y);
		double sumam = (mspg +mspp+msz+msnp+msng) / suma;
		 return sumam;
		
	}
    
}
