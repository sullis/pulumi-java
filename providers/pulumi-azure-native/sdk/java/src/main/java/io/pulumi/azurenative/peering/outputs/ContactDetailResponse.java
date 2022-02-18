// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContactDetailResponse {
    /**
     * The e-mail address of the contact.
     * 
     */
    private final @Nullable String email;
    /**
     * The phone number of the contact.
     * 
     */
    private final @Nullable String phone;
    /**
     * The role of the contact.
     * 
     */
    private final @Nullable String role;

    @OutputCustomType.Constructor({"email","phone","role"})
    private ContactDetailResponse(
        @Nullable String email,
        @Nullable String phone,
        @Nullable String role) {
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    /**
     * The e-mail address of the contact.
     * 
     */
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    /**
     * The phone number of the contact.
     * 
     */
    public Optional<String> getPhone() {
        return Optional.ofNullable(this.phone);
    }
    /**
     * The role of the contact.
     * 
     */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
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
