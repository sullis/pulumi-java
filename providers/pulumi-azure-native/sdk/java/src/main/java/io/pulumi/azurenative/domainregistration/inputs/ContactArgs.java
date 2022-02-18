// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.azurenative.domainregistration.inputs.AddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact information for domain registration. If 'Domain Privacy' option is not selected then the contact information is made publicly available through the Whois
 * directories as per ICANN requirements.
 * 
 */
public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * Mailing address.
     * 
     */
    @InputImport(name="addressMailing")
    private final @Nullable Input<AddressArgs> addressMailing;

    public Input<AddressArgs> getAddressMailing() {
        return this.addressMailing == null ? Input.empty() : this.addressMailing;
    }

    /**
     * Email address.
     * 
     */
    @InputImport(name="email", required=true)
    private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * Fax number.
     * 
     */
    @InputImport(name="fax")
    private final @Nullable Input<String> fax;

    public Input<String> getFax() {
        return this.fax == null ? Input.empty() : this.fax;
    }

    /**
     * Job title.
     * 
     */
    @InputImport(name="jobTitle")
    private final @Nullable Input<String> jobTitle;

    public Input<String> getJobTitle() {
        return this.jobTitle == null ? Input.empty() : this.jobTitle;
    }

    /**
     * First name.
     * 
     */
    @InputImport(name="nameFirst", required=true)
    private final Input<String> nameFirst;

    public Input<String> getNameFirst() {
        return this.nameFirst;
    }

    /**
     * Last name.
     * 
     */
    @InputImport(name="nameLast", required=true)
    private final Input<String> nameLast;

    public Input<String> getNameLast() {
        return this.nameLast;
    }

    /**
     * Middle name.
     * 
     */
    @InputImport(name="nameMiddle")
    private final @Nullable Input<String> nameMiddle;

    public Input<String> getNameMiddle() {
        return this.nameMiddle == null ? Input.empty() : this.nameMiddle;
    }

    /**
     * Organization contact belongs to.
     * 
     */
    @InputImport(name="organization")
    private final @Nullable Input<String> organization;

    public Input<String> getOrganization() {
        return this.organization == null ? Input.empty() : this.organization;
    }

    /**
     * Phone number.
     * 
     */
    @InputImport(name="phone", required=true)
    private final Input<String> phone;

    public Input<String> getPhone() {
        return this.phone;
    }

    public ContactArgs(
        @Nullable Input<AddressArgs> addressMailing,
        Input<String> email,
        @Nullable Input<String> fax,
        @Nullable Input<String> jobTitle,
        Input<String> nameFirst,
        Input<String> nameLast,
        @Nullable Input<String> nameMiddle,
        @Nullable Input<String> organization,
        Input<String> phone) {
        this.addressMailing = addressMailing;
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.fax = fax;
        this.jobTitle = jobTitle;
        this.nameFirst = Objects.requireNonNull(nameFirst, "expected parameter 'nameFirst' to be non-null");
        this.nameLast = Objects.requireNonNull(nameLast, "expected parameter 'nameLast' to be non-null");
        this.nameMiddle = nameMiddle;
        this.organization = organization;
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
    }

    private ContactArgs() {
        this.addressMailing = Input.empty();
        this.email = Input.empty();
        this.fax = Input.empty();
        this.jobTitle = Input.empty();
        this.nameFirst = Input.empty();
        this.nameLast = Input.empty();
        this.nameMiddle = Input.empty();
        this.organization = Input.empty();
        this.phone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AddressArgs> addressMailing;
        private Input<String> email;
        private @Nullable Input<String> fax;
        private @Nullable Input<String> jobTitle;
        private Input<String> nameFirst;
        private Input<String> nameLast;
        private @Nullable Input<String> nameMiddle;
        private @Nullable Input<String> organization;
        private Input<String> phone;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressMailing = defaults.addressMailing;
    	      this.email = defaults.email;
    	      this.fax = defaults.fax;
    	      this.jobTitle = defaults.jobTitle;
    	      this.nameFirst = defaults.nameFirst;
    	      this.nameLast = defaults.nameLast;
    	      this.nameMiddle = defaults.nameMiddle;
    	      this.organization = defaults.organization;
    	      this.phone = defaults.phone;
        }

        public Builder setAddressMailing(@Nullable Input<AddressArgs> addressMailing) {
            this.addressMailing = addressMailing;
            return this;
        }

        public Builder setAddressMailing(@Nullable AddressArgs addressMailing) {
            this.addressMailing = Input.ofNullable(addressMailing);
            return this;
        }

        public Builder setEmail(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder setFax(@Nullable Input<String> fax) {
            this.fax = fax;
            return this;
        }

        public Builder setFax(@Nullable String fax) {
            this.fax = Input.ofNullable(fax);
            return this;
        }

        public Builder setJobTitle(@Nullable Input<String> jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setJobTitle(@Nullable String jobTitle) {
            this.jobTitle = Input.ofNullable(jobTitle);
            return this;
        }

        public Builder setNameFirst(Input<String> nameFirst) {
            this.nameFirst = Objects.requireNonNull(nameFirst);
            return this;
        }

        public Builder setNameFirst(String nameFirst) {
            this.nameFirst = Input.of(Objects.requireNonNull(nameFirst));
            return this;
        }

        public Builder setNameLast(Input<String> nameLast) {
            this.nameLast = Objects.requireNonNull(nameLast);
            return this;
        }

        public Builder setNameLast(String nameLast) {
            this.nameLast = Input.of(Objects.requireNonNull(nameLast));
            return this;
        }

        public Builder setNameMiddle(@Nullable Input<String> nameMiddle) {
            this.nameMiddle = nameMiddle;
            return this;
        }

        public Builder setNameMiddle(@Nullable String nameMiddle) {
            this.nameMiddle = Input.ofNullable(nameMiddle);
            return this;
        }

        public Builder setOrganization(@Nullable Input<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder setOrganization(@Nullable String organization) {
            this.organization = Input.ofNullable(organization);
            return this;
        }

        public Builder setPhone(Input<String> phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = Input.of(Objects.requireNonNull(phone));
            return this;
        }

        public ContactArgs build() {
            return new ContactArgs(addressMailing, email, fax, jobTitle, nameFirst, nameLast, nameMiddle, organization, phone);
        }
    }
}
