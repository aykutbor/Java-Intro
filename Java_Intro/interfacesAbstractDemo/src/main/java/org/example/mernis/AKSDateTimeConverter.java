package org.example.mernis;

//------------------------------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 8.0.1.2
//
// Created by Quasar Development 
//
// This class has been generated for test purposes only and cannot be used in any commercial project.
// To use it in commercial project, you need to generate this class again with Premium account.
// Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
//
// Licence: 8C607E36502A35A6AA6B0D39A390F80ECB45285599246E3FF30553AEEF71D7764EA35FE257895B72A7BCBE0BDB33055339F2A16B40C125E07CF87825309FFBFB
//------------------------------------------------------------------------
import java.util.Date;


public interface AKSDateTimeConverter
{
    java.util.Date convertDateTime(String strDate);
    java.util.Date convertTime(String strDate);
    java.util.Date convertDate(String strDate);
    String convertDuration(String value);
    String getStringFromDateTime(Date value);
    String getStringFromDate(Date value);
    String getStringFromTime(Date value);
    String getStringFromDuration(String value);
}