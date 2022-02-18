// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The user configuration. This is required only if QuickConnectType is USER.
 * 
 */
public final class QuickConnectUserQuickConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectUserQuickConnectConfigArgs Empty = new QuickConnectUserQuickConnectConfigArgs();

    @InputImport(name="contactFlowArn", required=true)
    private final Input<String> contactFlowArn;

    public Input<String> getContactFlowArn() {
        return this.contactFlowArn;
    }

    @InputImport(name="userArn", required=true)
    private final Input<String> userArn;

    public Input<String> getUserArn() {
        return this.userArn;
    }

    public QuickConnectUserQuickConnectConfigArgs(
        Input<String> contactFlowArn,
        Input<String> userArn) {
        this.contactFlowArn = Objects.requireNonNull(contactFlowArn, "expected parameter 'contactFlowArn' to be non-null");
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
    }

    private QuickConnectUserQuickConnectConfigArgs() {
        this.contactFlowArn = Input.empty();
        this.userArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectUserQuickConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contactFlowArn;
        private Input<String> userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectUserQuickConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowArn = defaults.contactFlowArn;
    	      this.userArn = defaults.userArn;
        }

        public Builder setContactFlowArn(Input<String> contactFlowArn) {
            this.contactFlowArn = Objects.requireNonNull(contactFlowArn);
            return this;
        }

        public Builder setContactFlowArn(String contactFlowArn) {
            this.contactFlowArn = Input.of(Objects.requireNonNull(contactFlowArn));
            return this;
        }

        public Builder setUserArn(Input<String> userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }

        public Builder setUserArn(String userArn) {
            this.userArn = Input.of(Objects.requireNonNull(userArn));
            return this;
        }

        public QuickConnectUserQuickConnectConfigArgs build() {
            return new QuickConnectUserQuickConnectConfigArgs(contactFlowArn, userArn);
        }
    }
}
