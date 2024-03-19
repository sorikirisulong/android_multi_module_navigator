This repository presents a methodology to solve cases where dereferencing between layers is required in Android multi-modules or communication between feature modules.

<img width="865" alt="image" src="https://github.com/sorikirisulong/android_multi_module_navigator/assets/103094210/32011761-b755-42cf-8f75-99701e1e1189">





<img width="796" alt="image" src="https://github.com/sorikirisulong/android_multi_module_navigator/assets/103094210/d7d4c946-0751-4b23-af1a-65dba9274b17">

![image](https://github.com/sorikirisulong/android_multi_module_navigator/assets/103094210/0536098d-6ee0-46ca-819a-976512d5acc7)


```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph LR

  subgraph common
    common
    navigation
  end
  subgraph feature
    offer
    search
  end
  app --> common
  app --> navigation
  app --> search
  app --> offer
  search --> common
  search --> navigation
  offer --> common
  offer --> navigation
```
