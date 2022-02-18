// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The Azure mobile App push notification receiver.
 * 
 */
public final class AzureAppPushReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureAppPushReceiverResponse Empty = new AzureAppPushReceiverResponse();

    /**
     * The email address registered for the Azure mobile app.
     * 
     */
    @InputImport(name="emailAddress", required=true)
    private final String emailAddress;

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    public AzureAppPushReceiverResponse(
        String emailAddress,
        String name) {
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AzureAppPushReceiverResponse() {
        this.emailAddress = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureAppPushReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureAppPushReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public AzureAppPushReceiverResponse build() {
            return new AzureAppPushReceiverResponse(emailAddress, name);
        }
    }
}
