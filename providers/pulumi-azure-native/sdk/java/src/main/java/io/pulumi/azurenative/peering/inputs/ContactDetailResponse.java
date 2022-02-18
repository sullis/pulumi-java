// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The contact detail class.
 * 
 */
public final class ContactDetailResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContactDetailResponse Empty = new ContactDetailResponse();

    /**
     * The e-mail address of the contact.
     * 
     */
    @InputImport(name="email")
    private final @Nullable String email;

    public Optional<String> getEmail() {
        return this.email == null ? Optional.empty() : Optional.ofNullable(this.email);
    }

    /**
     * The phone number of the contact.
     * 
     */
    @InputImport(name="phone")
    private final @Nullable String phone;

    public Optional<String> getPhone() {
        return this.phone == null ? Optional.empty() : Optional.ofNullable(this.phone);
    }

    /**
     * The role of the contact.
     * 
     */
    @InputImport(name="role")
    private final @Nullable String role;

    public Optional<String> getRole() {
        return this.role == null ? Optional.empty() : Optional.ofNullable(this.role);
    }

    public ContactDetailResponse(
        @Nullable String email,
        @Nullable String phone,
        @Nullable String role) {
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    private ContactDetailResponse() {
        this.email = null;
        this.phone = null;
        this.role = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String phone;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.phone = defaults.phone;
    	      this.role = defaults.role;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(@Nullable String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = role;
            return this;
        }

        public ContactDetailResponse build() {
            return new ContactDetailResponse(email, phone, role);
        }
    }
}
