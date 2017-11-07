using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.SceneManagement;

public class HighScore : MonoBehaviour {

	// Use this for initialization
	public Text highScore;

	void Start () {
		highScore.text = PlayerPrefs.GetInt("Score").ToString();
	}

	void menu(){
		SceneManager.LoadScene("Menu");
	}

}
