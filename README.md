# AndroidTabLayoutExample
android material design TabLayout example.

### change tabMode (scrollable | fixed)

in activity_layout.xml, change **tabMode** into **scrollable** or **fixed**

  ```
  <android.support.design.widget.TabLayout
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:tabMode="scrollable"
        app:tabGravity="fill"/> 
  ```

### change tabGravity (fill | center)

in activity_layout.xml, change **tabGravity** into **fill** or **center**

  ```
  <android.support.design.widget.TabLayout
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:tabMode="scrollable"
        app:tabGravity="center"/>
  ```
