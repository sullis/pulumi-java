// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAndroidAppResult {
    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    private final String appId;
    /**
     * The user-assigned display name for the `AndroidApp`.
     * 
     */
    private final String displayName;
    /**
     * The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
     * 
     */
    private final String name;
    /**
     * Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console.
     * 
     */
    private final String packageName;
    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`.
     * 
     */
    private final String project;

    @OutputCustomType.Constructor({"appId","displayName","name","packageName","project"})
    private GetAndroidAppResult(
        String appId,
        String displayName,
        String name,
        String packageName,
        String project) {
        this.appId = Objects.requireNonNull(appId);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.packageName = Objects.requireNonNull(packageName);
        this.project = Objects.requireNonNull(project);
    }

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `AndroidApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
    */
    public String getAppId() {
        return this.appId;
    }
    /**
     * The user-assigned display name for the `AndroidApp`.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the AndroidApp, in the format: projects/ PROJECT_IDENTIFIER/androidApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The canonical package name of the Android app as would appear in the Google Play Developer Console.
     * 
    */
    public String getPackageName() {
        return this.packageName;
    }
    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `AndroidApp`.
     * 
    */
    public String getProject() {
        return this.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAndroidAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String displayName;
        private String name;
        private String packageName;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAndroidAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.packageName = defaults.packageName;
    	      this.project = defaults.project;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public GetAndroidAppResult build() {
            return new GetAndroidAppResult(appId, displayName, name, packageName, project);
        }
    }
}