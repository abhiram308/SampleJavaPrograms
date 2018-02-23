package hackerearth.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RoyAndProfilePicture {
	public static void main(String[] args) throws Exception{
		process();
	}
	
	public static void process() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int L = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		List<PictureDimension> pictures= new ArrayList<>();
		for(int i=0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken());
			int H = Integer.parseInt(st.nextToken());
			PictureDimension pictureDimension = new PictureDimension();
			pictureDimension.setLength(H);
			pictureDimension.setWidth(W);
			pictures.add(pictureDimension);
		}
		
		for(PictureDimension pictureDimension : pictures) {
			if(pictureDimension.getLength() < L || pictureDimension.getWidth() < L) {
				System.out.println("UPLOAD ANOTHER");
			} else if (pictureDimension.getLength() != pictureDimension.getWidth()) {
				System.out.println("CROP IT");
			} else {
				System.out.println("ACCEPTED");
			}
		}
		
	}
}

class PictureDimension {
	private int length;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	private int width;
	
	
}