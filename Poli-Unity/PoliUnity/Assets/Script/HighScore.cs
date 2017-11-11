using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class HighScore : MonoBehaviour {

	// Use this for initialization
	public Text highScore;
	public Text bonus;

	void Start () {
		highScore.text = PlayerPrefs.GetInt("Score").ToString();
		bonus.text = PlayerPrefs.GetString("Bonus");
	}

	public void menu(){
		SceneManager.LoadScene("Menu");
	}

	public void reset(){
		PlayerPrefs.DeleteKey ("Score");
	}

}
