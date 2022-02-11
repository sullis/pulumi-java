// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class QuickConnectPhoneNumberQuickConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectPhoneNumberQuickConnectConfigArgs Empty = new QuickConnectPhoneNumberQuickConnectConfigArgs();

    @InputImport(name="phoneNumber", required=true)
    private final Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public QuickConnectPhoneNumberQuickConnectConfigArgs(Input<String> phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private QuickConnectPhoneNumberQuickConnectConfigArgs() {
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectPhoneNumberQuickConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectPhoneNumberQuickConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setPhoneNumber(Input<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Input.of(Objects.requireNonNull(phoneNumber));
            return this;
        }

        public QuickConnectPhoneNumberQuickConnectConfigArgs build() {
            return new QuickConnectPhoneNumberQuickConnectConfigArgs(phoneNumber);
        }
    }
}
