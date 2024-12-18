using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Spinner : MonoBehaviour
{
    [SerializeField] float yAngle = 1f;
    void Update()
    {
        transform.Rotate(0,yAngle,0);
    }
}
