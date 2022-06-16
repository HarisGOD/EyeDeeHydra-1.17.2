package Eye.De.Hydra;

import java.io.FileWriter;
import java.io.IOException;

public class AddResourcesHelper{
	public static void AddItemsResources(String name) {
		
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\item\\"+name+"_red_item.json", false);
			out.write("{\"parent\": \"item/generated\",\"textures\": {\"layer0\": \"eye_de_hydra:item/"+name+"_red_item\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\item\\"+name+"_blue_item.json", false);
			out.write("{\"parent\": \"item/generated\",\"textures\": {\"layer0\": \"eye_de_hydra:item/"+name+"_blue_item\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\item\\"+name+"_yellow_item.json", false);
			out.write("{\"parent\": \"item/generated\",\"textures\": {\"layer0\": \"eye_de_hydra:item/"+name+"_yellow_item\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\item\\"+name+"_green_item.json", false);
			out.write("{\"parent\": \"item/generated\",\"textures\": {\"layer0\": \"eye_de_hydra:item/"+name+"_green_item\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\item\\"+name+"_white_item.json", false);
			out.write("{\"parent\": \"item/generated\",\"textures\": {\"layer0\": \"eye_de_hydra:item/"+name+"_white_item\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\item\\"+name+"_black_item.json", false);
			out.write("{\"parent\": \"item/generated\",\"textures\": {\"layer0\": \"eye_de_hydra:item/"+name+"_black_item\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
			
			
			
		
		
		
	}
	
	
	
public static void AddBlocksResources(String name) {
		
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\block\\"+name+"_red_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_red_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\block\\"+name+"_blue_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_blue_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\block\\"+name+"_yellow_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_yellow_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\block\\"+name+"_green_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_green_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\block\\"+name+"_white_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_white_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\models\\block\\"+name+"_black_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_black_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
			
			
		
		
		try {
			FileWriter out = new FileWriter("eyeDeeHydra\\src\\main\\resources\\assets\\eye_de_hydra\\blockstates\\"+name+"_black_block.json", false);
			out.write("{\"parent\": \"block/cube_all\",\"textures\": {\"all\": \"eye_de_hydra:block/"+name+"_black_block\"}}");out.flush();}catch(IOException e){e.printStackTrace();}
			
		
		
		
		
		
		
		
	}
}