// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BackendServiceIAPOAuth2ClientInfoResponse {
    /**
     * Application name to be used in OAuth consent screen.
     * 
     */
    private final String applicationName;
    /**
     * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
     */
    private final String clientName;
    /**
     * Developer's information to be used in OAuth consent screen.
     * 
     */
    private final String developerEmailAddress;

    @OutputCustomType.Constructor({"applicationName","clientName","developerEmailAddress"})
    private BackendServiceIAPOAuth2ClientInfoResponse(
        String applicationName,
        String clientName,
        String developerEmailAddress) {
        this.applicationName = Objects.requireNonNull(applicationName);
        this.clientName = Objects.requireNonNull(clientName);
        this.developerEmailAddress = Objects.requireNonNull(developerEmailAddress);
    }

    /**
     * Application name to be used in OAuth consent screen.
     * 
    */
    public String getApplicationName() {
        return this.applicationName;
    }
    /**
     * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
    */
    public String getClientName() {
        return this.clientName;
    }
    /**
     * Developer's information to be used in OAuth consent screen.
     * 
    */
    public String getDeveloperEmailAddress() {
        return this.developerEmailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPOAuth2ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String clientName;
        private String developerEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPOAuth2ClientInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clientName = defaults.clientName;
    	      this.developerEmailAddress = defaults.developerEmailAddress;
        }

        public Builder setApplicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder setClientName(String clientName) {
            this.clientName = Objects.requireNonNull(clientName);
            return this;
        }

        public Builder setDeveloperEmailAddress(String developerEmailAddress) {
            this.developerEmailAddress = Objects.requireNonNull(developerEmailAddress);
            return this;
        }
        public BackendServiceIAPOAuth2ClientInfoResponse build() {
            return new BackendServiceIAPOAuth2ClientInfoResponse(applicationName, clientName, developerEmailAddress);
        }
    }
}