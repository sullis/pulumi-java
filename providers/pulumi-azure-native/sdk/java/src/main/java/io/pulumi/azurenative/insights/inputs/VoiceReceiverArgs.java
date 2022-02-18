// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A voice receiver.
 * 
 */
public final class VoiceReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final VoiceReceiverArgs Empty = new VoiceReceiverArgs();

    /**
     * The country code of the voice receiver.
     * 
     */
    @InputImport(name="countryCode", required=true)
    private final Input<String> countryCode;

    public Input<String> getCountryCode() {
        return this.countryCode;
    }

    /**
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The phone number of the voice receiver.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
    private final Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public VoiceReceiverArgs(
        Input<String> countryCode,
        Input<String> name,
        Input<String> phoneNumber) {
        this.countryCode = Objects.requireNonNull(countryCode, "expected parameter 'countryCode' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private VoiceReceiverArgs() {
        this.countryCode = Input.empty();
        this.name = Input.empty();
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> countryCode;
        private Input<String> name;
        private Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setCountryCode(Input<String> countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = Input.of(Objects.requireNonNull(countryCode));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPhoneNumber(Input<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Input.of(Objects.requireNonNull(phoneNumber));
            return this;
        }

        public VoiceReceiverArgs build() {
            return new VoiceReceiverArgs(countryCode, name, phoneNumber);
        }
    }
}
