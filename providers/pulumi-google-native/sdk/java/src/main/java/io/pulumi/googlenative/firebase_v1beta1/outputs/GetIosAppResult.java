// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetIosAppResult {
    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
     */
    private final String appId;
    /**
     * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
     * 
     */
    private final String appStoreId;
    /**
     * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
     * 
     */
    private final String bundleId;
    /**
     * The user-assigned display name for the `IosApp`.
     * 
     */
    private final String displayName;
    /**
     * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
     * 
     */
    private final String name;
    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `IosApp`.
     * 
     */
    private final String project;
    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     * 
     */
    private final String teamId;

    @OutputCustomType.Constructor({"appId","appStoreId","bundleId","displayName","name","project","teamId"})
    private GetIosAppResult(
        String appId,
        String appStoreId,
        String bundleId,
        String displayName,
        String name,
        String project,
        String teamId) {
        this.appId = Objects.requireNonNull(appId);
        this.appStoreId = Objects.requireNonNull(appStoreId);
        this.bundleId = Objects.requireNonNull(bundleId);
        this.displayName = Objects.requireNonNull(displayName);
        this.name = Objects.requireNonNull(name);
        this.project = Objects.requireNonNull(project);
        this.teamId = Objects.requireNonNull(teamId);
    }

    /**
     * Immutable. The globally unique, Firebase-assigned identifier for the `IosApp`. This identifier should be treated as an opaque token, as the data format is not specified.
     * 
    */
    public String getAppId() {
        return this.appId;
    }
    /**
     * The automatically generated Apple ID assigned to the iOS app by Apple in the iOS App Store.
     * 
    */
    public String getAppStoreId() {
        return this.appStoreId;
    }
    /**
     * Immutable. The canonical bundle ID of the iOS app as it would appear in the iOS AppStore.
     * 
    */
    public String getBundleId() {
        return this.bundleId;
    }
    /**
     * The user-assigned display name for the `IosApp`.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The resource name of the IosApp, in the format: projects/PROJECT_IDENTIFIER /iosApps/APP_ID * PROJECT_IDENTIFIER: the parent Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number) ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510 standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned identifier for the App (see [`appId`](../projects.iosApps#IosApp.FIELDS.app_id)).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. A user-assigned unique identifier of the parent FirebaseProject for the `IosApp`.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * The Apple Developer Team ID associated with the App in the App Store.
     * 
    */
    public String getTeamId() {
        return this.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIosAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String appStoreId;
        private String bundleId;
        private String displayName;
        private String name;
        private String project;
        private String teamId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIosAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appStoreId = defaults.appStoreId;
    	      this.bundleId = defaults.bundleId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.teamId = defaults.teamId;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppStoreId(String appStoreId) {
            this.appStoreId = Objects.requireNonNull(appStoreId);
            return this;
        }

        public Builder setBundleId(String bundleId) {
            this.bundleId = Objects.requireNonNull(bundleId);
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

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setTeamId(String teamId) {
            this.teamId = Objects.requireNonNull(teamId);
            return this;
        }
        public GetIosAppResult build() {
            return new GetIosAppResult(appId, appStoreId, bundleId, displayName, name, project, teamId);
        }
    }
}