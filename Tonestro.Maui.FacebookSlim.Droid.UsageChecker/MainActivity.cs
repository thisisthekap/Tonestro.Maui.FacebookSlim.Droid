using Com.Tonestro.Facebookslim;

namespace Tonestro.Maui.FacebookSlim.Droid.UsageChecker;

[Activity(Label = "@string/app_name", MainLauncher = true)]
public class MainActivity : Activity
{
    protected override void OnCreate(Bundle? savedInstanceState)
    {
        base.OnCreate(savedInstanceState);
        var facebookAppEventsLogger = AppEventsLoggerSlim.NewLogger(this) ??
                                      throw new NullReferenceException("failed to create facebook app events logger");
        facebookAppEventsLogger.LogEvent("ASDF", null);
        // Set our view from the "main" layout resource
        SetContentView(Resource.Layout.activity_main);
    }
}