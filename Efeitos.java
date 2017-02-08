import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Efeitos {
	/****************************************************************************************************
	* Descrição: Converte a imagem de RGB para YIQ e depois volta para RGB			       			    *	   
	****************************************************************************************************/
    public static BufferedImage rgbToyiq(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        float yiq[] = new float[3];
        int rgb[] = new int[3];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                rgb[0] = c.getRed();
                rgb[1] = c.getGreen();
                rgb[2] = c.getBlue();
                //RGB para YIQ
                yiq = rgbTOyiq(rgb);
                //YIQ para RGB
                rgb = yiqTOrgb(yiq);
                Color color = new Color(rgb[0], rgb[1], rgb[2]);
                image.setRGB(i, j, color.getRGB());
            }
        }
        return image;
    }


    private static float[] rgbTOyiq(int rgb[]) {
        float yiq[] = new float[3];
        yiq[0] = 0.299f * rgb[0] + 0.587f * rgb[1] + 0.114f * rgb[2];
        yiq[1] = 0.596f * rgb[0] - 0.274f * rgb[1] - 0.322f * rgb[2];
        yiq[2] = 0.211f * rgb[0] - 0.523f * rgb[1] + 0.312f * rgb[2];
        return yiq;
    }

    private static int[] yiqTOrgb(float[] yiq) {
        int rgb[] = new int[3];
        rgb[0] = Math.round(yiq[0] + 0.956f * yiq[1] + 0.621f * yiq[2]) > 255 ? 255 : Math.round(yiq[0] + 0.956f * yiq[1] + 0.621f * yiq[2]) < 0 ? 0 : Math.round(yiq[0] + 0.956f * yiq[1] + 0.621f * yiq[2]);
        rgb[1] = Math.round(yiq[0] - 0.272f * yiq[1] - 0.647f * yiq[2]) > 255 ? 255 : Math.round(yiq[0] - 0.272f * yiq[1] - 0.647f * yiq[2]) < 0 ? 0 : Math.round(yiq[0] - 0.272f * yiq[1] - 0.647f * yiq[2]);
        rgb[2] = Math.round(yiq[0] - 1.106f * yiq[1] + 1.703f * yiq[2]) > 255 ? 255 : Math.round(yiq[0] - 1.106f * yiq[1] + 1.703f * yiq[2]) < 0 ? 0 : Math.round(yiq[0] - 1.106f * yiq[1] + 1.703f * yiq[2]);
        return rgb;
    }

    
    /****************************************************************************************************
	* Descrição: Exibe uma única banda da imagem, que nesse caso é o vermelho, ou seja em tons de       *
	* vermelho 		       					                       				                        *
	****************************************************************************************************/
    public static BufferedImage red(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int r = c.getRed();
                c = new Color(r, 0, 0);
                image.setRGB(i, j, c.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Exibe uma única banda da imagem, que nesse caso é o verde, ou seja em tons de verde    *
 	****************************************************************************************************/
    public static BufferedImage green(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int g = c.getGreen();
                c = new Color(0, g, 0);
                image.setRGB(i, j, c.getRGB());
            }
        }
        return image;
    }
	
	/****************************************************************************************************
	* Descrição: Exibe uma única banda da imagem, que nesse caso é o azul, ou seja em tons de azul      *
 	****************************************************************************************************/
    public static BufferedImage blue(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int b = c.getBlue();
                c = new Color(0, 0, b);
                image.setRGB(i, j, c.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Exibe uma única banda da imagem como imagem monocromática, que nesse caso é o vermelho *
 	****************************************************************************************************/
    public static BufferedImage monocromaticoRed(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int r = c.getRed();
                c = new Color(r, r, r);
                image.setRGB(i, j, c.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Exibe uma única banda da imagem como imagem monocromática, que nesse caso é o verde    *
 	****************************************************************************************************/
    public static BufferedImage monocromaticoGreen(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int g = c.getGreen();
                c = new Color(g, g, g);
                image.setRGB(i, j, c.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Exibe uma única banda da imagem como imagem monocromática, que nesse caso é o azul     *
 	****************************************************************************************************/
    public static BufferedImage monocromaticoBlue(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int b = c.getBlue();
                c = new Color(b, b, b);
                image.setRGB(i, j, c.getRGB());
            }
        }
        return image;
    }

    /****************************************************************************************************
	* Descrição: Aplica o negativo em Y na imagem, após coverte-lá para o sistema YIQ                   *
 	****************************************************************************************************/
    public static BufferedImage negativoY(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        float yiq[] = new float[3];
        int rgb[] = new int[3];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                rgb[0] = c.getRed();
                rgb[1] = c.getGreen();
                rgb[2] = c.getBlue();
                
                yiq = rgbTOyiq(rgb);
                yiq[0] = 255 - yiq[0];
                //Coverte para YIQ   
                rgb = yiqTOrgb(yiq);
                Color color = new Color(rgb[0], rgb[1], rgb[2]);
                image.setRGB(i, j, color.getRGB());
            }
        }
   
        return image;
    }

	/****************************************************************************************************
	* Descrição: Aplica o negativo RGB na imagem                                                        *
 	****************************************************************************************************/
    public static BufferedImage negativoRGB(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int r = 255 - c.getRed();
                int g = 255 - c.getGreen();
                int b = 255 - c.getBlue();
                Color color = new Color(r, g, b);
                image.setRGB(i, j, color.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: aplica o negativo em R na imagem                                                       *
 	****************************************************************************************************/
    public static BufferedImage negativoR(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int r = 255 - c.getRed();
                Color color = new Color(r, 0, 0);
                image.setRGB(i, j, color.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Aplica o negativo em G na imagem                                                       *
 	****************************************************************************************************/
    public static BufferedImage negativoG(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int g = 255 - c.getGreen();
                Color color = new Color(0, g, 0);
                image.setRGB(i, j, color.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Aplica o negativo em B na imagem                                                       *
 	****************************************************************************************************/
    public static BufferedImage negativoB(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color c = new Color(image.getRGB(i, j));
                int b = 255 - c.getBlue();
                Color color = new Color(0, 0, b);
                image.setRGB(i, j, color.getRGB());
            }
        }
        return image;
    }

    /****************************************************************************************************
	* Descrição: Aplica na imagem um brilho aditivo                                                     *
 	****************************************************************************************************/
    public static BufferedImage brilhoAdd(BufferedImage image, int c) {
        int width = image.getWidth();
        int height = image.getHeight();
        int rgb[] = new int[3];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color cor = new Color(image.getRGB(i, j));
                rgb[0] = cor.getRed()+c;
                rgb[1] = cor.getGreen()+c;
                rgb[2] = cor.getBlue()+c;
                if (rgb[0] > 255) {
                    rgb[0] = 255;
                }
                else if (rgb[0] < 0) {
                    rgb[0] = 0;
                }
                if (rgb[1] < 0) {
                    rgb[1] = 0;
                }
                else if (rgb[1] > 255) {
                    rgb[1] = 255;
                }
                if (rgb[2] < 0) {
                    rgb[2] = 0;
                }
                else if (rgb[2] > 255) {
                    rgb[2] = 255;
                }
                cor = new Color(rgb[0], rgb[1], rgb[2]);
                image.setRGB(i, j, cor.getRGB());
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Aplica na imagem um brilho aditivo no sistema YIQ                                      *
 	****************************************************************************************************/
    public static BufferedImage brilhoAddEmY(BufferedImage image, int c) {
        int width = image.getWidth();
        int height = image.getHeight();
        float yiq[] = new float[3];
        int rgb[] = new int[3];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color cor = new Color(image.getRGB(i, j));
                rgb[0] = cor.getRed();
                rgb[1] = cor.getGreen();
                rgb[2] = cor.getBlue();
                yiq = rgbTOyiq(rgb); //converte para o sistema yiq, para manipular apenas o brilho
                yiq[0] += c; //Altera o brilho no sistema yiq                
                rgb = yiqTOrgb(yiq); //converte para o sistema rgb               
                cor = new Color(rgb[0], rgb[1], rgb[2]);
                image.setRGB(i, j, cor.getRGB());
            }
        }
        return image;
    }

    
    
    /****************************************************************************************************
	* Descrição: Aplica na imagem um brilho multiplicativo                                              *
 	****************************************************************************************************/
    public static BufferedImage brilhoMult(BufferedImage image, float c) {
        int width = image.getWidth();
        int height = image.getHeight();
        int rgb[] = new int[3];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color cor = new Color(image.getRGB(i, j));
                rgb[0] = Math.round(cor.getRed()*c);
                rgb[1] = Math.round(cor.getGreen()*c);
                rgb[2] = Math.round(cor.getBlue()*c);
                if (rgb[0] > 255) {
                    rgb[0] = 255;
                }
                else if (rgb[0] < 0) {
                    rgb[0] = 0;
                }
                if (rgb[1] < 0) {
                    rgb[1] = 0;
                }
                else if (rgb[1] > 255) {
                    rgb[1] = 255;
                }
                if (rgb[2] < 0) {
                    rgb[2] = 0;
                }
                else if (rgb[2] > 255) {
                    rgb[2] = 255;
                }
                
                System.out.println("R "+rgb[0]+" G "+rgb[1]+" B "+rgb[2]);
                
                cor = new Color(rgb[0], rgb[1], rgb[2]);
                image.setRGB(i, j, cor.getRGB());
            
            }
        }
        return image;
    }
    
	/****************************************************************************************************
	* Descrição: Aplica na imagem um brilho multiplicativo no sistema YIQ                               *
 	****************************************************************************************************/
    public static BufferedImage brilhoMultEmY(BufferedImage image, float c) {
        int width = image.getWidth();
        int height = image.getHeight();
        float yiq[] = new float[3];
        int rgb[] = new int[3];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Color cor = new Color(image.getRGB(i, j));
                rgb[0] = cor.getRed();
                rgb[1] = cor.getGreen();
                rgb[2] = cor.getBlue();
                
                System.out.println("R "+rgb[0]+" G "+rgb[1]+" B "+rgb[2]);
                
                yiq = rgbTOyiq(rgb); //converte para o sistema yiq, para manipular apenas o brilho
                yiq[0] *= c; //Altera o brilho no sistema yiq                
                rgb = yiqTOrgb(yiq); //converte para o sistema rgb               
                cor = new Color(rgb[0], rgb[1], rgb[2]);
                image.setRGB(i, j, cor.getRGB());
                
            }
        }
        return image;        
    }
    
    /****************************************************************************************************
	* Descrição: Aplica na imagem o filtro da média, e esse filtro é de dimensão n x n                  *
 	****************************************************************************************************/
    public static BufferedImage media(BufferedImage image, int n) {
        int width = image.getWidth(); //Largura da imagem
        int height = image.getHeight(); //Altura da imagem
        int r, g, b, //Componentes de cor
                i2 = 0, j2 = 0; //Variáveis auxiliares, servem para varrer o pixel central e seus vizinhos
        Color rgb; //Cor a ser setada na imagem

        //Varre a imagem inteira
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                //A cada pixel visitado, zera os elementos de cor para não usar lixo da iteração anterior
                r = g = b = 0;
                //Varre o elemento do meio e seus vizinhos
                for (i2 = i - (n / 2); i2 <= i + (n / 2); i2++) {
                    for (j2 = j - (n / 2); j2 <= j + (n / 2); j2++) {
                        //Se algum dos vizinhos estiver fora dos limites da imagem, suas componentes adicionarão 0, ou simplemente não haverá processamento
                        try {
                            r += new Color(image.getRGB(i2, j2)).getRed();
                            g += new Color(image.getRGB(i2, j2)).getGreen();
                            b += new Color(image.getRGB(i2, j2)).getBlue();
                        } catch (ArrayIndexOutOfBoundsException e) {
                            //r += 0; g += 0; b += 0; // Processamento desnecessário
                        }
                    }
                }
                r /= (n * n);
                g /= (n * n);
                b /= (n * n); //Após a soma, calcula-se a média
                rgb = new Color(r, g, b);
                image.setRGB(i, j, rgb.getRGB()); //Insere a cor no pixel do meio
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Aplica na imagem o filtro da mediana, e esse filtro é de dimensão n x n                  *
 	****************************************************************************************************/
    public static BufferedImage mediana(BufferedImage image, int n) {
        int width = image.getWidth(); //Largura da imagem
        int height = image.getHeight(); //Altura da imagem
        int r[] = new int[n * n], g[] = new int[n * n], b[] = new int[n * n], //Vetores com tamanho nxn que guardarão as componentes r, g e b a cada iteração
                i2 = 0, j2 = 0, cont; //Variáveis auxiliares, servem para varrer o pixel central e seus vizinhos
        Color rgb; //Cor a ser setada na imagem

        //Varre a imagem inteira
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                //A cada pixel visitado, zera o contador para poder visitá-lo, visitar seus vizinhos e em seguida calcular a mediana
                cont = 0;
                //Varre o elemento do meio e seus vizinhos
                for (i2 = i - (n / 2); i2 <= i + (n / 2); i2++) {
                    for (j2 = j - (n / 2); j2 <= j + (n / 2); j2++) {
                        //Se algum dos vizinhos estiver fora dos limites da imagem, seu pixel receberá 0 para r, g e b
                        try {
                            r[cont] = new Color(image.getRGB(i2, j2)).getRed();
                            g[cont] = new Color(image.getRGB(i2, j2)).getGreen();
                            b[cont] = new Color(image.getRGB(i2, j2)).getBlue();
                            cont++;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            r[cont] = g[cont] = b[cont] = 0;
                        }
                    }
                }
                Arrays.sort(r);
                Arrays.sort(g);
                Arrays.sort(b); //Ordena o vetor com o pixel e seus vizinhos
                rgb = new Color(r[r.length / 2], g[g.length / 2], b[b.length / 2]); //Calcula a mediana para cada componente e atribui a cor
                image.setRGB(i, j, rgb.getRGB()); //Insere a cor no pixel do meio
            }
        }
        return image;
    }

    /****************************************************************************************************
	* Descrição: Realiza a mistura de duas imagens                                                      *
 	****************************************************************************************************/
    public static BufferedImage misturaImg(BufferedImage img, BufferedImage img2) {

        if (img.getWidth() != img2.getWidth() || img.getHeight() != img2.getHeight()) {
            JOptionPane.showMessageDialog(null, "Selecione imagens de mesmas dimensões. Abra novamente a imagem", "ERROR", JOptionPane.ERROR_MESSAGE, null);
            return null;
        }
        Color rgb, rgb2, rgbMix;
        int width = img.getWidth();
        int height = img.getHeight();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rgb = new Color(img.getRGB(i, j));
                rgb2 = new Color(img2.getRGB(i, j));

                int r = (rgb.getRed() + rgb2.getRed()) / 2;
                int g = (rgb.getGreen() + rgb2.getGreen()) / 2;
                int b = (rgb.getBlue() + rgb2.getBlue()) / 2;

                rgbMix = new Color(r, g, b);
                img.setRGB(i, j, rgbMix.getRGB());
            }
        }
        return img;
    }

    /****************************************************************************************************
	* Descrição: Aplica na imagem a limiarização usando a média                                         *
 	****************************************************************************************************/
    public static BufferedImage limiarMedia(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();
        Color rgb;
        //trabalho apenas com  a banda r pois o valor e o mesmo para as três bandas
        int l, r = 0;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rgb = new Color(image.getRGB(i, j));
                r += rgb.getRed();
            }
        }
        l = r / (width * height);
        JOptionPane.showMessageDialog(null, "media: " + l);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rgb = new Color(image.getRGB(i, j));
                if (rgb.getBlue()> l) {
                    image.setRGB(i, j, 0xffffff); //branco
                } else {
                    image.setRGB(i, j, 0x000000); //preto
                }
            }
        }
        return image;
    }

	/****************************************************************************************************
	* Descrição: Aplica a limiarização na imagem com um limiar t escolhito pelo usuário                 *
 	****************************************************************************************************/
    public static BufferedImage limiar(BufferedImage image, int t) {
        int width = image.getWidth();
        int height = image.getHeight();
        Color rgb;
        int l;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                rgb = new Color(image.getRGB(i, j));
                //pego so uma banda por que as três possuem o mesmo valor de todo jeito uma vez que a
                //imagem a ser passada como parametro e monocromatica
                l = rgb.getRed();
                if (l > t) {
                    image.setRGB(i, j, 0xffffff); //branco
                } else {
                    image.setRGB(i, j, 0x000000); //preto
                }
            }
        }
        return image;
    }

}
