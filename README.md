EstimatorDummy
==============

A dummy estimator plugin for the framework of evaluating information completeness of event logs.

An estimator is the implementation of an approach to evaluating the
information completeness of an event log. See http://bpmcenter.org/wp-content/uploads/reports/2012/BPM-12-04.pdf
for more information about the log completeness problem. 
	
To put an estimator into real application, some additional work has to be done. 
For example, parsing the event log files. A framework for evaluating log completeness has been
proposed to deal such additional work. See
https://github.com/hunter99/CompletenessFramework for more details on the
framework.

If the estimator implements the Java interface 'howmuch.estimator.Estimator' required by the framework mentioned above, 
it can be deployed conveniently as a plugin of the framework by means of
simply putting the estimator jar file(s) into the directory
'./lib/plugins/estimators/' of the framework. 

This project implements a dummy estimator as an example.
