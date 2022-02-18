// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.enums.AppType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAppArgs Empty = new GetAppArgs();

    /**
     * The name of the app.
     * 
     */
    @InputImport(name="appName", required=true)
    private final String appName;

    public String getAppName() {
        return this.appName;
    }

    /**
     * The type of app.
     * 
     */
    @InputImport(name="appType", required=true)
    private final AppType appType;

    public AppType getAppType() {
        return this.appType;
    }

    /**
     * The domain ID.
     * 
     */
    @InputImport(name="domainId", required=true)
    private final String domainId;

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * The user profile name.
     * 
     */
    @InputImport(name="userProfileName", required=true)
    private final String userProfileName;

    public String getUserProfileName() {
        return this.userProfileName;
    }

    public GetAppArgs(
        String appName,
        AppType appType,
        String domainId,
        String userProfileName) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.appType = Objects.requireNonNull(appType, "expected parameter 'appType' to be non-null");
        this.domainId = Objects.requireNonNull(domainId, "expected parameter 'domainId' to be non-null");
        this.userProfileName = Objects.requireNonNull(userProfileName, "expected parameter 'userProfileName' to be non-null");
    }

    private GetAppArgs() {
        this.appName = null;
        this.appType = null;
        this.domainId = null;
        this.userProfileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appName;
        private AppType appType;
        private String domainId;
        private String userProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.appType = defaults.appType;
    	      this.domainId = defaults.domainId;
    	      this.userProfileName = defaults.userProfileName;
        }

        public Builder setAppName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder setAppType(AppType appType) {
            this.appType = Objects.requireNonNull(appType);
            return this;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder setUserProfileName(String userProfileName) {
            this.userProfileName = Objects.requireNonNull(userProfileName);
            return this;
        }

        public GetAppArgs build() {
            return new GetAppArgs(appName, appType, domainId, userProfileName);
        }
    }
}
