// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.domains_v1beta1.enums.ContactSettingsPrivacy;
import com.pulumi.googlenative.domains_v1beta1.inputs.ContactArgs;
import java.util.Objects;


/**
 * Defines the contact information associated with a `Registration`. [ICANN](https://icann.org/) requires all domain names to have associated contact information. The `registrant_contact` is considered the domain&#39;s legal owner, and often the other contacts are identical.
 * 
 */
public final class ContactSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContactSettingsArgs Empty = new ContactSettingsArgs();

    /**
     * The administrative contact for the `Registration`.
     * 
     */
    @Import(name="adminContact", required=true)
    private Output<ContactArgs> adminContact;

    /**
     * @return The administrative contact for the `Registration`.
     * 
     */
    public Output<ContactArgs> adminContact() {
        return this.adminContact;
    }

    /**
     * Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    @Import(name="privacy", required=true)
    private Output<ContactSettingsPrivacy> privacy;

    /**
     * @return Privacy setting for the contacts associated with the `Registration`.
     * 
     */
    public Output<ContactSettingsPrivacy> privacy() {
        return this.privacy;
    }

    /**
     * The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    @Import(name="registrantContact", required=true)
    private Output<ContactArgs> registrantContact;

    /**
     * @return The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
     * 
     */
    public Output<ContactArgs> registrantContact() {
        return this.registrantContact;
    }

    /**
     * The technical contact for the `Registration`.
     * 
     */
    @Import(name="technicalContact", required=true)
    private Output<ContactArgs> technicalContact;

    /**
     * @return The technical contact for the `Registration`.
     * 
     */
    public Output<ContactArgs> technicalContact() {
        return this.technicalContact;
    }

    private ContactSettingsArgs() {}

    private ContactSettingsArgs(ContactSettingsArgs $) {
        this.adminContact = $.adminContact;
        this.privacy = $.privacy;
        this.registrantContact = $.registrantContact;
        this.technicalContact = $.technicalContact;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContactSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContactSettingsArgs $;

        public Builder() {
            $ = new ContactSettingsArgs();
        }

        public Builder(ContactSettingsArgs defaults) {
            $ = new ContactSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adminContact The administrative contact for the `Registration`.
         * 
         * @return builder
         * 
         */
        public Builder adminContact(Output<ContactArgs> adminContact) {
            $.adminContact = adminContact;
            return this;
        }

        /**
         * @param adminContact The administrative contact for the `Registration`.
         * 
         * @return builder
         * 
         */
        public Builder adminContact(ContactArgs adminContact) {
            return adminContact(Output.of(adminContact));
        }

        /**
         * @param privacy Privacy setting for the contacts associated with the `Registration`.
         * 
         * @return builder
         * 
         */
        public Builder privacy(Output<ContactSettingsPrivacy> privacy) {
            $.privacy = privacy;
            return this;
        }

        /**
         * @param privacy Privacy setting for the contacts associated with the `Registration`.
         * 
         * @return builder
         * 
         */
        public Builder privacy(ContactSettingsPrivacy privacy) {
            return privacy(Output.of(privacy));
        }

        /**
         * @param registrantContact The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
         * 
         * @return builder
         * 
         */
        public Builder registrantContact(Output<ContactArgs> registrantContact) {
            $.registrantContact = registrantContact;
            return this;
        }

        /**
         * @param registrantContact The registrant contact for the `Registration`. *Caution: Anyone with access to this email address, phone number, and/or postal address can take control of the domain.* *Warning: For new `Registration`s, the registrant receives an email confirmation that they must complete within 15 days to avoid domain suspension.*
         * 
         * @return builder
         * 
         */
        public Builder registrantContact(ContactArgs registrantContact) {
            return registrantContact(Output.of(registrantContact));
        }

        /**
         * @param technicalContact The technical contact for the `Registration`.
         * 
         * @return builder
         * 
         */
        public Builder technicalContact(Output<ContactArgs> technicalContact) {
            $.technicalContact = technicalContact;
            return this;
        }

        /**
         * @param technicalContact The technical contact for the `Registration`.
         * 
         * @return builder
         * 
         */
        public Builder technicalContact(ContactArgs technicalContact) {
            return technicalContact(Output.of(technicalContact));
        }

        public ContactSettingsArgs build() {
            $.adminContact = Objects.requireNonNull($.adminContact, "expected parameter 'adminContact' to be non-null");
            $.privacy = Objects.requireNonNull($.privacy, "expected parameter 'privacy' to be non-null");
            $.registrantContact = Objects.requireNonNull($.registrantContact, "expected parameter 'registrantContact' to be non-null");
            $.technicalContact = Objects.requireNonNull($.technicalContact, "expected parameter 'technicalContact' to be non-null");
            return $;
        }
    }

}
