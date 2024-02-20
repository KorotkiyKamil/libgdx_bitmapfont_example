package com.bitmap.font;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class BitmapFontTest extends Game {
	
	private Stage stage;


	@Override
	public void create () {
		
		stage = new Stage(new StretchViewport(800,480));		

		Label.LabelStyle labelStyle = new Label.LabelStyle();
		BitmapFont myFont = new BitmapFont(Gdx.files.internal("OpenSans-standard.fnt"));
		labelStyle.font = myFont;
		//labelStyle.fontColor = Color.RED;
		//labelStyle.fontColor = Color.GREEN;
		//labelStyle.fontColor = Color.BLUE;
		Label label = new Label("BitmapFont LibGdx",labelStyle);
		myFont.getData().setScale(1.0F);
		label.setPosition(256,224);
		stage.addActor(label);

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act();
		stage.draw();

	}
}