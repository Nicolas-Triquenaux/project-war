package GUIobjects;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import misc.Dimension2D;


public class BackImage 
{
	private String Name;
	private File ImgFile;
	private Image RealImg;
	private Dimension2D size;
	
	
	public BackImage(String Name, String Path, int width, int height) 
	{
		this.size = new Dimension2D(width,height);
		this.Name = Name;
		ImgFile = new File(Path);

	}
	
	private void generateImg()
	{
		try 
		{
			RealImg = ImageIO.read(ImgFile);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String getName()
	{
		return Name;
	}
	
	public Dimension2D getImgSize()
	{
		return this.size;
	}
	
	public Image getFinalImage()
	{
		return RealImg;
	}
	
	public BackImage getImage()
	{
		if(RealImg == null)
		{
			this.generateImg();
		}
		return this;
	}
}