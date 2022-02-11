// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.auditmanager.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssessmentAWSAccount extends io.pulumi.resources.InvokeArgs {

    public static final AssessmentAWSAccount Empty = new AssessmentAWSAccount();

    @InputImport(name="emailAddress")
    private final @Nullable String emailAddress;

    public Optional<String> getEmailAddress() {
        return this.emailAddress == null ? Optional.empty() : Optional.ofNullable(this.emailAddress);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public AssessmentAWSAccount(
        @Nullable String emailAddress,
        @Nullable String id,
        @Nullable String name) {
        this.emailAddress = emailAddress;
        this.id = id;
        this.name = name;
    }

    private AssessmentAWSAccount() {
        this.emailAddress = null;
        this.id = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentAWSAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;
        private @Nullable String id;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentAWSAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder setEmailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public AssessmentAWSAccount build() {
            return new AssessmentAWSAccount(emailAddress, id, name);
        }
    }
}
