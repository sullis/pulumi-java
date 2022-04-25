// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.domains_v1.outputs.ContactResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContactSettingsResponse {
    /**
     * @return The administrative contact for the `Registration`.
     * 
     */
    private final ContactResponse adminContact;
    /**
     * @return Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    private final String privacy;
    /**
     * @return The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    private final ContactResponse registrantContact;
    /**
     * @return The technical contact for the `Registration`.
     * 
     */
    private final ContactResponse technicalContact;

    @CustomType.Constructor
    private ContactSettingsResponse(
        @CustomType.Parameter("adminContact") ContactResponse adminContact,
        @CustomType.Parameter("privacy") String privacy,
        @CustomType.Parameter("registrantContact") ContactResponse registrantContact,
        @CustomType.Parameter("technicalContact") ContactResponse technicalContact) {
        this.adminContact = adminContact;
        this.privacy = privacy;
        this.registrantContact = registrantContact;
        this.technicalContact = technicalContact;
    }

    /**
     * @return The administrative contact for the `Registration`.
     * 
     */
    public ContactResponse adminContact() {
        return this.adminContact;
    }
    /**
     * @return Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    public String privacy() {
        return this.privacy;
    }
    /**
     * @return The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    public ContactResponse registrantContact() {
        return this.registrantContact;
    }
    /**
     * @return The technical contact for the `Registration`.
     * 
     */
    public ContactResponse technicalContact() {
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

        public Builder adminContact(ContactResponse adminContact) {
            this.adminContact = Objects.requireNonNull(adminContact);
            return this;
        }
        public Builder privacy(String privacy) {
            this.privacy = Objects.requireNonNull(privacy);
            return this;
        }
        public Builder registrantContact(ContactResponse registrantContact) {
            this.registrantContact = Objects.requireNonNull(registrantContact);
            return this;
        }
        public Builder technicalContact(ContactResponse technicalContact) {
            this.technicalContact = Objects.requireNonNull(technicalContact);
            return this;
        }        public ContactSettingsResponse build() {
            return new ContactSettingsResponse(adminContact, privacy, registrantContact, technicalContact);
        }
    }
}
