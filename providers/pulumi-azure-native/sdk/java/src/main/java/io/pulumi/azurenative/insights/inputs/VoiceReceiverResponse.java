// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A voice receiver.
 * 
 */
public final class VoiceReceiverResponse extends io.pulumi.resources.InvokeArgs {

    public static final VoiceReceiverResponse Empty = new VoiceReceiverResponse();

    /**
     * The country code of the voice receiver.
     * 
     */
    @InputImport(name="countryCode", required=true)
      private final String countryCode;

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The phone number of the voice receiver.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
      private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public VoiceReceiverResponse(
        String countryCode,
        String name,
        String phoneNumber) {
        this.countryCode = Objects.requireNonNull(countryCode, "expected parameter 'countryCode' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private VoiceReceiverResponse() {
        this.countryCode = null;
        this.name = null;
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String countryCode;
        private String name;
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setCountryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public VoiceReceiverResponse build() {
            return new VoiceReceiverResponse(countryCode, name, phoneNumber);
        }
    }
}