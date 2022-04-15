// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog.inputs;

import io.pulumi.awsnative.servicecatalog.enums.CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudFormationProvisionedProductProvisioningPreferences extends io.pulumi.resources.InvokeArgs {

    public static final CloudFormationProvisionedProductProvisioningPreferences Empty = new CloudFormationProvisionedProductProvisioningPreferences();

    @Import(name="stackSetAccounts")
      private final @Nullable List<String> stackSetAccounts;

    public List<String> stackSetAccounts() {
        return this.stackSetAccounts == null ? List.of() : this.stackSetAccounts;
    }

    @Import(name="stackSetFailureToleranceCount")
      private final @Nullable Integer stackSetFailureToleranceCount;

    public Optional<Integer> stackSetFailureToleranceCount() {
        return this.stackSetFailureToleranceCount == null ? Optional.empty() : Optional.ofNullable(this.stackSetFailureToleranceCount);
    }

    @Import(name="stackSetFailureTolerancePercentage")
      private final @Nullable Integer stackSetFailureTolerancePercentage;

    public Optional<Integer> stackSetFailureTolerancePercentage() {
        return this.stackSetFailureTolerancePercentage == null ? Optional.empty() : Optional.ofNullable(this.stackSetFailureTolerancePercentage);
    }

    @Import(name="stackSetMaxConcurrencyCount")
      private final @Nullable Integer stackSetMaxConcurrencyCount;

    public Optional<Integer> stackSetMaxConcurrencyCount() {
        return this.stackSetMaxConcurrencyCount == null ? Optional.empty() : Optional.ofNullable(this.stackSetMaxConcurrencyCount);
    }

    @Import(name="stackSetMaxConcurrencyPercentage")
      private final @Nullable Integer stackSetMaxConcurrencyPercentage;

    public Optional<Integer> stackSetMaxConcurrencyPercentage() {
        return this.stackSetMaxConcurrencyPercentage == null ? Optional.empty() : Optional.ofNullable(this.stackSetMaxConcurrencyPercentage);
    }

    @Import(name="stackSetOperationType")
      private final @Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType;

    public Optional<CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType> stackSetOperationType() {
        return this.stackSetOperationType == null ? Optional.empty() : Optional.ofNullable(this.stackSetOperationType);
    }

    @Import(name="stackSetRegions")
      private final @Nullable List<String> stackSetRegions;

    public List<String> stackSetRegions() {
        return this.stackSetRegions == null ? List.of() : this.stackSetRegions;
    }

    public CloudFormationProvisionedProductProvisioningPreferences(
        @Nullable List<String> stackSetAccounts,
        @Nullable Integer stackSetFailureToleranceCount,
        @Nullable Integer stackSetFailureTolerancePercentage,
        @Nullable Integer stackSetMaxConcurrencyCount,
        @Nullable Integer stackSetMaxConcurrencyPercentage,
        @Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType,
        @Nullable List<String> stackSetRegions) {
        this.stackSetAccounts = stackSetAccounts;
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
        this.stackSetOperationType = stackSetOperationType;
        this.stackSetRegions = stackSetRegions;
    }

    private CloudFormationProvisionedProductProvisioningPreferences() {
        this.stackSetAccounts = List.of();
        this.stackSetFailureToleranceCount = null;
        this.stackSetFailureTolerancePercentage = null;
        this.stackSetMaxConcurrencyCount = null;
        this.stackSetMaxConcurrencyPercentage = null;
        this.stackSetOperationType = null;
        this.stackSetRegions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationProvisionedProductProvisioningPreferences defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> stackSetAccounts;
        private @Nullable Integer stackSetFailureToleranceCount;
        private @Nullable Integer stackSetFailureTolerancePercentage;
        private @Nullable Integer stackSetMaxConcurrencyCount;
        private @Nullable Integer stackSetMaxConcurrencyPercentage;
        private @Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType;
        private @Nullable List<String> stackSetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationProvisionedProductProvisioningPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackSetAccounts = defaults.stackSetAccounts;
    	      this.stackSetFailureToleranceCount = defaults.stackSetFailureToleranceCount;
    	      this.stackSetFailureTolerancePercentage = defaults.stackSetFailureTolerancePercentage;
    	      this.stackSetMaxConcurrencyCount = defaults.stackSetMaxConcurrencyCount;
    	      this.stackSetMaxConcurrencyPercentage = defaults.stackSetMaxConcurrencyPercentage;
    	      this.stackSetOperationType = defaults.stackSetOperationType;
    	      this.stackSetRegions = defaults.stackSetRegions;
        }

        public Builder stackSetAccounts(@Nullable List<String> stackSetAccounts) {
            this.stackSetAccounts = stackSetAccounts;
            return this;
        }
        public Builder stackSetAccounts(String... stackSetAccounts) {
            return stackSetAccounts(List.of(stackSetAccounts));
        }
        public Builder stackSetFailureToleranceCount(@Nullable Integer stackSetFailureToleranceCount) {
            this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
            return this;
        }
        public Builder stackSetFailureTolerancePercentage(@Nullable Integer stackSetFailureTolerancePercentage) {
            this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
            return this;
        }
        public Builder stackSetMaxConcurrencyCount(@Nullable Integer stackSetMaxConcurrencyCount) {
            this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
            return this;
        }
        public Builder stackSetMaxConcurrencyPercentage(@Nullable Integer stackSetMaxConcurrencyPercentage) {
            this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
            return this;
        }
        public Builder stackSetOperationType(@Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType) {
            this.stackSetOperationType = stackSetOperationType;
            return this;
        }
        public Builder stackSetRegions(@Nullable List<String> stackSetRegions) {
            this.stackSetRegions = stackSetRegions;
            return this;
        }
        public Builder stackSetRegions(String... stackSetRegions) {
            return stackSetRegions(List.of(stackSetRegions));
        }        public CloudFormationProvisionedProductProvisioningPreferences build() {
            return new CloudFormationProvisionedProductProvisioningPreferences(stackSetAccounts, stackSetFailureToleranceCount, stackSetFailureTolerancePercentage, stackSetMaxConcurrencyCount, stackSetMaxConcurrencyPercentage, stackSetOperationType, stackSetRegions);
        }
    }
}
