// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1alpha2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1alpha2.outputs.ContactResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContactSettingsResponse {
    /**
     * The administrative contact for the `Registration`.
     * 
     */
    private final ContactResponse adminContact;
    /**
     * Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    private final String privacy;
    /**
     * The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    private final ContactResponse registrantContact;
    /**
     * The technical contact for the `Registration`.
     * 
     */
    private final ContactResponse technicalContact;

    @OutputCustomType.Constructor({"adminContact","privacy","registrantContact","technicalContact"})
    private ContactSettingsResponse(
        ContactResponse adminContact,
        String privacy,
        ContactResponse registrantContact,
        ContactResponse technicalContact) {
        this.adminContact = Objects.requireNonNull(adminContact);
        this.privacy = Objects.requireNonNull(privacy);
        this.registrantContact = Objects.requireNonNull(registrantContact);
        this.technicalContact = Objects.requireNonNull(technicalContact);
    }

    /**
     * The administrative contact for the `Registration`.
     * 
    */
    public ContactResponse getAdminContact() {
        return this.adminContact;
    }
    /**
     * Privacy setting for the contacts associated with the `Registration`.
     * 
    */
    public String getPrivacy() {
        return this.privacy;
    }
    /**
     * The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
    */
    public ContactResponse getRegistrantContact() {
        return this.registrantContact;
    }
    /**
     * The technical contact for the `Registration`.
     * 
    */
    public ContactResponse getTechnicalContact() {
        return this.technicalContact;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactResponse adminContact;
        private String privacy;
        private ContactResponse registrantContact;
        private ContactResponse technicalContact;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminContact = defaults.adminContact;
    	      this.privacy = defaults.privacy;
    	      this.registrantContact = defaults.registrantContact;
    	      this.technicalContact = defaults.technicalContact;
        }

        public Builder setAdminContact(ContactResponse adminContact) {
            this.adminContact = Objects.requireNonNull(adminContact);
            return this;
        }

        public Builder setPrivacy(String privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }

        public Builder setRegistrantContact(ContactResponse registrantContact) {
            this.registrantContact = Objects.requireNonNull(registrantContact);
            return this;
        }

        public Builder setTechnicalContact(ContactResponse technicalContact) {
            this.technicalContact = Objects.requireNonNull(technicalContact);
            return this;
        }
        public ContactSettingsResponse build() {
            return new ContactSettingsResponse(adminContact, privacy, registrantContact, technicalContact);
        }
    }
}