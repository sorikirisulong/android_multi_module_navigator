### Dependency Diagram

```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph LR

  subgraph common
    common
    datamodel
    instant
    navigation
  end
  subgraph core
    abtest
    network
    util
  end
  subgraph design
    design
  end
  subgraph feature
    inputtravel
    member
    offer
    packagetour
    review
    stay
    tna
  end
  datamodel --> util
  packagetour --> common
  packagetour --> instant
  packagetour --> navigation
  packagetour --> datamodel
  packagetour --> network
  instant --> urison
  instant --> abtest
  instant --> util
  instant --> navigation
  instant --> network
  instant --> datamodel
  instant --> common
  instant --> design
  stay --> instant
  stay --> navigation
  stay --> datamodel
  stay --> network
  tna --> instant
  tna --> navigation
  tna --> urison
  tna --> abtest
  review --> instant
  review --> navigation
  review --> network
  review --> datamodel
  review --> common
  inputtravel --> instant
  inputtravel --> navigation
  inputtravel --> datamodel
  inputtravel --> network
  member --> instant
  member --> navigation
  member --> datamodel
  member --> network
  app --> urison
  app --> abtest
  app --> network
  app --> instant
  app --> navigation
  app --> datamodel
  app --> offer
  app --> review
  app --> tna
  app --> stay
  app --> inputtravel
  app --> packagetour
  app --> member
  offer --> instant
  offer --> navigation
  offer --> datamodel
  offer --> urison
  offer --> abtest
  offer --> network
  offer --> common
```
This repository presents a methodology to solve cases where dereferencing between layers is required in Android multi-modules or communication between feature modules.

<img width="865" alt="image" src="https://github.com/sorikirisulong/android_multi_module_navigator/assets/103094210/32011761-b755-42cf-8f75-99701e1e1189">





<img width="796" alt="image" src="https://github.com/sorikirisulong/android_multi_module_navigator/assets/103094210/d7d4c946-0751-4b23-af1a-65dba9274b17">

![image](https://github.com/sorikirisulong/android_multi_module_navigator/assets/103094210/0536098d-6ee0-46ca-819a-976512d5acc7)



