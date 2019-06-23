
package com.tnia.imagej;

import net.imagej.ImageJ;
import net.imglib2.type.NativeType;
import net.imglib2.type.numeric.RealType;

public class ImageJTemplate {

	public static <T extends RealType<T> & NativeType<T>> void main(
		final String[] args) 
	{
		
		ImageJ ij=new ImageJ();
		ij.launch(args);

	}
}
