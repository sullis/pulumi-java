// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A voice receiver.
 * 
 */
public final class VoiceReceiverResponse extends com.pulumi.resources.InvokeArgs {

    public static final VoiceReceiverResponse Empty = new VoiceReceiverResponse();

    /**
     * The country code of the voice receiver.
     * 
     */
    @Import(name="countryCode", required=true)
    private String countryCode;

    /**
     * @return The country code of the voice receiver.
     * 
     */
    public String countryCode() {
        return this.countryCode;
    }

    /**
     * The name of the voice receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the voice receiver. Names must be unique across all receivers within an action group.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The phone number of the voice receiver.
     * 
     */
    @Import(name="phoneNumber", required=true)
    private String phoneNumber;

    /**
     * @return The phone number of the voice receiver.
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }

    private VoiceReceiverResponse() {}

    private VoiceReceiverResponse(VoiceReceiverResponse $) {
        this.countryCode = $.countryCode;
        this.name = $.name;
        this.phoneNumber = $.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VoiceReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VoiceReceiverResponse $;

        public Builder() {
            $ = new VoiceReceiverResponse();
        }

        public Builder(VoiceReceiverResponse defaults) {
            $ = new VoiceReceiverResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param countryCode The country code of the voice receiver.
         * 
         * @return builder
         * 
         */
        public Builder countryCode(String countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        /**
         * @param name The name of the voice receiver. Names must be unique across all receivers within an action group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param phoneNumber The phone number of the voice receiver.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(String phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        public VoiceReceiverResponse build() {
            $.countryCode = Objects.requireNonNull($.countryCode, "expected parameter 'countryCode' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.phoneNumber = Objects.requireNonNull($.phoneNumber, "expected parameter 'phoneNumber' to be non-null");
            return $;
        }
    }

}
