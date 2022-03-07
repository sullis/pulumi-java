// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AzureBackupRuleResponse;
import io.pulumi.azurenative.dataprotection.inputs.AzureRetentionRuleResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Rule based backup policy
 * 
 */
public final class BackupPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupPolicyResponse Empty = new BackupPolicyResponse();

    /**
     * Type of datasource for the backup management
     * 
     */
    @InputImport(name="datasourceTypes", required=true)
      private final List<String> datasourceTypes;

    public List<String> getDatasourceTypes() {
        return this.datasourceTypes;
    }

    /**
     * Expected value is 'BackupPolicy'.
     * 
     */
    @InputImport(name="objectType", required=true)
      private final String objectType;

    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    @InputImport(name="policyRules", required=true)
      private final List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

    public List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> getPolicyRules() {
        return this.policyRules;
    }

    public BackupPolicyResponse(
        List<String> datasourceTypes,
        String objectType,
        List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
        this.datasourceTypes = Objects.requireNonNull(datasourceTypes, "expected parameter 'datasourceTypes' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.policyRules = Objects.requireNonNull(policyRules, "expected parameter 'policyRules' to be non-null");
    }

    private BackupPolicyResponse() {
        this.datasourceTypes = List.of();
        this.objectType = null;
        this.policyRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> datasourceTypes;
        private String objectType;
        private List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceTypes = defaults.datasourceTypes;
    	      this.objectType = defaults.objectType;
    	      this.policyRules = defaults.policyRules;
        }

        public Builder setDatasourceTypes(List<String> datasourceTypes) {
            this.datasourceTypes = Objects.requireNonNull(datasourceTypes);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setPolicyRules(List<Either<AzureBackupRuleResponse,AzureRetentionRuleResponse>> policyRules) {
            this.policyRules = Objects.requireNonNull(policyRules);
            return this;
        }
        public BackupPolicyResponse build() {
            return new BackupPolicyResponse(datasourceTypes, objectType, policyRules);
        }
    }
}