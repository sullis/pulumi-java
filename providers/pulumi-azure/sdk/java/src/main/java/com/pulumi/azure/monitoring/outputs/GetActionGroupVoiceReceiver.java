// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionGroupVoiceReceiver {
    /**
     * @return The country code of the voice receiver.
     * 
     */
    private final String countryCode;
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    private final String name;
    /**
     * @return The phone number of the voice receiver.
     * 
     */
    private final String phoneNumber;

    @CustomType.Constructor
    private GetActionGroupVoiceReceiver(
        @CustomType.Parameter("countryCode") String countryCode,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("phoneNumber") String phoneNumber) {
        this.countryCode = countryCode;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return The country code of the voice receiver.
     * 
     */
    public String countryCode() {
        return this.countryCode;
    }
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The phone number of the voice receiver.
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionGroupVoiceReceiver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String countryCode;
        private String name;
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActionGroupVoiceReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCode = defaults.countryCode;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder countryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }        public GetActionGroupVoiceReceiver build() {
            return new GetActionGroupVoiceReceiver(countryCode, name, phoneNumber);
        }
    }
}
