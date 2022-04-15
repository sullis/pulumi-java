// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContactTargetInfo {
    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
     */
    private final String contactId;
    /**
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * 
     */
    private final Boolean isEssential;

    @CustomType.Constructor
    private ContactTargetInfo(
        @CustomType.Parameter("contactId") String contactId,
        @CustomType.Parameter("isEssential") Boolean isEssential) {
        this.contactId = contactId;
        this.isEssential = isEssential;
    }

    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
    */
    public String contactId() {
        return this.contactId;
    }
    /**
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * 
    */
    public Boolean isEssential() {
        return this.isEssential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactTargetInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactId;
        private Boolean isEssential;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactTargetInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactId = defaults.contactId;
    	      this.isEssential = defaults.isEssential;
        }

        public Builder contactId(String contactId) {
            this.contactId = Objects.requireNonNull(contactId);
            return this;
        }
        public Builder isEssential(Boolean isEssential) {
            this.isEssential = Objects.requireNonNull(isEssential);
            return this;
        }        public ContactTargetInfo build() {
            return new ContactTargetInfo(contactId, isEssential);
        }
    }
}
