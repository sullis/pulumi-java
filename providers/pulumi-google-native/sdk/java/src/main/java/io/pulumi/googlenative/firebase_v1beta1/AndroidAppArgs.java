// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AndroidAppArgs extends io.pulumi.resources.ResourceArgs {

    public static final AndroidAppArgs Empty = new AndroidAppArgs();

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    @InputImport(name="appId")
      private final @Nullable Input<String> appId;

    public Input<String> getAppId() {
        return this.appId == null ? Input.empty() : this.appId;
    }

    /**
     * The user-assigned display name for the `AndroidApp`.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console.
     * 
     */
    @InputImport(name="packageName")
      private final @Nullable Input<String> packageName;

    public Input<String> getPackageName() {
        return this.packageName == null ? Input.empty() : this.packageName;
    }

    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public AndroidAppArgs(
        @Nullable Input<String> appId,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> packageName,
        @Nullable Input<String> project) {
        this.appId = appId;
        this.displayName = displayName;
        this.name = name;
        this.packageName = packageName;
        this.project = project;
    }

    private AndroidAppArgs() {
        this.appId = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.packageName = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appId;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> packageName;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.packageName = defaults.packageName;
    	      this.project = defaults.project;
        }

        public Builder setAppId(@Nullable Input<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = Input.ofNullable(appId);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPackageName(@Nullable Input<String> packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackageName(@Nullable String packageName) {
            this.packageName = Input.ofNullable(packageName);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public AndroidAppArgs build() {
            return new AndroidAppArgs(appId, displayName, name, packageName, project);
        }
    }
}