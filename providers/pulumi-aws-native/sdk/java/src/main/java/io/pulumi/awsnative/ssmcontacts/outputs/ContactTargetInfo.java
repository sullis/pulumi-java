// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor({"contactId","isEssential"})
    private ContactTargetInfo(
        String contactId,
        Boolean isEssential) {
        this.contactId = Objects.requireNonNull(contactId);
        this.isEssential = Objects.requireNonNull(isEssential);
    }

    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
     */
    public String getContactId() {
        return this.contactId;
    }
    /**
     * A Boolean value determining if the contact's acknowledgement stops the progress of stages in the plan.
     * 
     */
    public Boolean getIsEssential() {
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

        public Builder setContactId(String contactId) {
            this.contactId = Objects.requireNonNull(contactId);
            return this;
        }

        public Builder setIsEssential(Boolean isEssential) {
            this.isEssential = Objects.requireNonNull(isEssential);
            return this;
        }

        public ContactTargetInfo build() {
            return new ContactTargetInfo(contactId, isEssential);
        }
    }
}
