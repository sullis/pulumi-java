// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.AppBundleResponse;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import io.pulumi.googlenative.testing_v1.inputs.RoboDirectiveResponse;
import io.pulumi.googlenative.testing_v1.inputs.RoboStartingIntentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A test of an android application that explores the application on a virtual or physical Android Device, finding culprits and crashes as it goes.
 * 
 */
public final class AndroidRoboTestResponse extends io.pulumi.resources.InvokeArgs {

    public static final AndroidRoboTestResponse Empty = new AndroidRoboTestResponse();

    /**
     * The APK for the application under test.
     * 
     */
    @InputImport(name="appApk", required=true)
      private final FileReferenceResponse appApk;

    public FileReferenceResponse getAppApk() {
        return this.appApk;
    }

    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    @InputImport(name="appBundle", required=true)
      private final AppBundleResponse appBundle;

    public AppBundleResponse getAppBundle() {
        return this.appBundle;
    }

    /**
     * The initial activity that should be used to start the app.
     * 
     */
    @InputImport(name="appInitialActivity", required=true)
      private final String appInitialActivity;

    public String getAppInitialActivity() {
        return this.appInitialActivity;
    }

    /**
     * The java package for the application under test. The default value is determined by examining the application's manifest.
     * 
     */
    @InputImport(name="appPackageId", required=true)
      private final String appPackageId;

    public String getAppPackageId() {
        return this.appPackageId;
    }

    /**
     * A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
     * 
     */
    @InputImport(name="roboDirectives", required=true)
      private final List<RoboDirectiveResponse> roboDirectives;

    public List<RoboDirectiveResponse> getRoboDirectives() {
        return this.roboDirectives;
    }

    /**
     * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
     */
    @InputImport(name="roboMode", required=true)
      private final String roboMode;

    public String getRoboMode() {
        return this.roboMode;
    }

    /**
     * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
     * 
     */
    @InputImport(name="roboScript", required=true)
      private final FileReferenceResponse roboScript;

    public FileReferenceResponse getRoboScript() {
        return this.roboScript;
    }

    /**
     * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
     * 
     */
    @InputImport(name="startingIntents", required=true)
      private final List<RoboStartingIntentResponse> startingIntents;

    public List<RoboStartingIntentResponse> getStartingIntents() {
        return this.startingIntents;
    }

    public AndroidRoboTestResponse(
        FileReferenceResponse appApk,
        AppBundleResponse appBundle,
        String appInitialActivity,
        String appPackageId,
        List<RoboDirectiveResponse> roboDirectives,
        String roboMode,
        FileReferenceResponse roboScript,
        List<RoboStartingIntentResponse> startingIntents) {
        this.appApk = Objects.requireNonNull(appApk, "expected parameter 'appApk' to be non-null");
        this.appBundle = Objects.requireNonNull(appBundle, "expected parameter 'appBundle' to be non-null");
        this.appInitialActivity = Objects.requireNonNull(appInitialActivity, "expected parameter 'appInitialActivity' to be non-null");
        this.appPackageId = Objects.requireNonNull(appPackageId, "expected parameter 'appPackageId' to be non-null");
        this.roboDirectives = Objects.requireNonNull(roboDirectives, "expected parameter 'roboDirectives' to be non-null");
        this.roboMode = Objects.requireNonNull(roboMode, "expected parameter 'roboMode' to be non-null");
        this.roboScript = Objects.requireNonNull(roboScript, "expected parameter 'roboScript' to be non-null");
        this.startingIntents = Objects.requireNonNull(startingIntents, "expected parameter 'startingIntents' to be non-null");
    }

    private AndroidRoboTestResponse() {
        this.appApk = null;
        this.appBundle = null;
        this.appInitialActivity = null;
        this.appPackageId = null;
        this.roboDirectives = List.of();
        this.roboMode = null;
        this.roboScript = null;
        this.startingIntents = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidRoboTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse appApk;
        private AppBundleResponse appBundle;
        private String appInitialActivity;
        private String appPackageId;
        private List<RoboDirectiveResponse> roboDirectives;
        private String roboMode;
        private FileReferenceResponse roboScript;
        private List<RoboStartingIntentResponse> startingIntents;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidRoboTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appApk = defaults.appApk;
    	      this.appBundle = defaults.appBundle;
    	      this.appInitialActivity = defaults.appInitialActivity;
    	      this.appPackageId = defaults.appPackageId;
    	      this.roboDirectives = defaults.roboDirectives;
    	      this.roboMode = defaults.roboMode;
    	      this.roboScript = defaults.roboScript;
    	      this.startingIntents = defaults.startingIntents;
        }

        public Builder setAppApk(FileReferenceResponse appApk) {
            this.appApk = Objects.requireNonNull(appApk);
            return this;
        }

        public Builder setAppBundle(AppBundleResponse appBundle) {
            this.appBundle = Objects.requireNonNull(appBundle);
            return this;
        }

        public Builder setAppInitialActivity(String appInitialActivity) {
            this.appInitialActivity = Objects.requireNonNull(appInitialActivity);
            return this;
        }

        public Builder setAppPackageId(String appPackageId) {
            this.appPackageId = Objects.requireNonNull(appPackageId);
            return this;
        }

        public Builder setRoboDirectives(List<RoboDirectiveResponse> roboDirectives) {
            this.roboDirectives = Objects.requireNonNull(roboDirectives);
            return this;
        }

        public Builder setRoboMode(String roboMode) {
            this.roboMode = Objects.requireNonNull(roboMode);
            return this;
        }

        public Builder setRoboScript(FileReferenceResponse roboScript) {
            this.roboScript = Objects.requireNonNull(roboScript);
            return this;
        }

        public Builder setStartingIntents(List<RoboStartingIntentResponse> startingIntents) {
            this.startingIntents = Objects.requireNonNull(startingIntents);
            return this;
        }
        public AndroidRoboTestResponse build() {
            return new AndroidRoboTestResponse(appApk, appBundle, appInitialActivity, appPackageId, roboDirectives, roboMode, roboScript, startingIntents);
        }
    }
}