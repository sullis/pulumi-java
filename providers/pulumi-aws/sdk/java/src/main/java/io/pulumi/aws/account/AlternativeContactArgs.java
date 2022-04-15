// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.account;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlternativeContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlternativeContactArgs Empty = new AlternativeContactArgs();

    /**
     * The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The type of the alternate contact. Allowed values are: `BILLING`, `OPERATIONS`, `SECURITY`.
     * 
     */
    @Import(name="alternateContactType", required=true)
      private final Output<String> alternateContactType;

    public Output<String> alternateContactType() {
        return this.alternateContactType;
    }

    /**
     * An email address for the alternate contact.
     * 
     */
    @Import(name="emailAddress", required=true)
      private final Output<String> emailAddress;

    public Output<String> emailAddress() {
        return this.emailAddress;
    }

    /**
     * The name of the alternate contact.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A phone number for the alternate contact.
     * 
     */
    @Import(name="phoneNumber", required=true)
      private final Output<String> phoneNumber;

    public Output<String> phoneNumber() {
        return this.phoneNumber;
    }

    /**
     * A title for the alternate contact.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    public AlternativeContactArgs(
        @Nullable Output<String> accountId,
        Output<String> alternateContactType,
        Output<String> emailAddress,
        @Nullable Output<String> name,
        Output<String> phoneNumber,
        Output<String> title) {
        this.accountId = accountId;
        this.alternateContactType = Objects.requireNonNull(alternateContactType, "expected parameter 'alternateContactType' to be non-null");
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.name = name;
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private AlternativeContactArgs() {
        this.accountId = Codegen.empty();
        this.alternateContactType = Codegen.empty();
        this.emailAddress = Codegen.empty();
        this.name = Codegen.empty();
        this.phoneNumber = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlternativeContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private Output<String> alternateContactType;
        private Output<String> emailAddress;
        private @Nullable Output<String> name;
        private Output<String> phoneNumber;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AlternativeContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.alternateContactType = defaults.alternateContactType;
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.title = defaults.title;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder alternateContactType(Output<String> alternateContactType) {
            this.alternateContactType = Objects.requireNonNull(alternateContactType);
            return this;
        }
        public Builder alternateContactType(String alternateContactType) {
            this.alternateContactType = Output.of(Objects.requireNonNull(alternateContactType));
            return this;
        }
        public Builder emailAddress(Output<String> emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Output.of(Objects.requireNonNull(emailAddress));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder phoneNumber(Output<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Output.of(Objects.requireNonNull(phoneNumber));
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public AlternativeContactArgs build() {
            return new AlternativeContactArgs(accountId, alternateContactType, emailAddress, name, phoneNumber, title);
        }
    }
}
