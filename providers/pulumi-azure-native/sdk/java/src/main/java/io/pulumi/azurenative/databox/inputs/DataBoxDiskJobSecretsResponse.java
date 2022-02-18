// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.CloudErrorResponse;
import io.pulumi.azurenative.databox.inputs.DcAccessSecurityCodeResponse;
import io.pulumi.azurenative.databox.inputs.DiskSecretResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The secrets related to disk job.
 * 
 */
public final class DataBoxDiskJobSecretsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxDiskJobSecretsResponse Empty = new DataBoxDiskJobSecretsResponse();

    /**
     * Dc Access Security Code for Customer Managed Shipping
     * 
     */
    @InputImport(name="dcAccessSecurityCode", required=true)
    private final DcAccessSecurityCodeResponse dcAccessSecurityCode;

    public DcAccessSecurityCodeResponse getDcAccessSecurityCode() {
        return this.dcAccessSecurityCode;
    }

    /**
     * Contains the list of secrets object for that device.
     * 
     */
    @InputImport(name="diskSecrets", required=true)
    private final List<DiskSecretResponse> diskSecrets;

    public List<DiskSecretResponse> getDiskSecrets() {
        return this.diskSecrets;
    }

    /**
     * Error while fetching the secrets.
     * 
     */
    @InputImport(name="error", required=true)
    private final CloudErrorResponse error;

    public CloudErrorResponse getError() {
        return this.error;
    }

    /**
     * Whether passkey was provided by user.
     * 
     */
    @InputImport(name="isPasskeyUserDefined", required=true)
    private final Boolean isPasskeyUserDefined;

    public Boolean getIsPasskeyUserDefined() {
        return this.isPasskeyUserDefined;
    }

    /**
     * Used to indicate what type of job secrets object.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    @InputImport(name="jobSecretsType", required=true)
    private final String jobSecretsType;

    public String getJobSecretsType() {
        return this.jobSecretsType;
    }

    /**
     * PassKey for the disk Job.
     * 
     */
    @InputImport(name="passKey", required=true)
    private final String passKey;

    public String getPassKey() {
        return this.passKey;
    }

    public DataBoxDiskJobSecretsResponse(
        DcAccessSecurityCodeResponse dcAccessSecurityCode,
        List<DiskSecretResponse> diskSecrets,
        CloudErrorResponse error,
        Boolean isPasskeyUserDefined,
        String jobSecretsType,
        String passKey) {
        this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode, "expected parameter 'dcAccessSecurityCode' to be non-null");
        this.diskSecrets = Objects.requireNonNull(diskSecrets, "expected parameter 'diskSecrets' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.isPasskeyUserDefined = Objects.requireNonNull(isPasskeyUserDefined, "expected parameter 'isPasskeyUserDefined' to be non-null");
        this.jobSecretsType = Objects.requireNonNull(jobSecretsType, "expected parameter 'jobSecretsType' to be non-null");
        this.passKey = Objects.requireNonNull(passKey, "expected parameter 'passKey' to be non-null");
    }

    private DataBoxDiskJobSecretsResponse() {
        this.dcAccessSecurityCode = null;
        this.diskSecrets = List.of();
        this.error = null;
        this.isPasskeyUserDefined = null;
        this.jobSecretsType = null;
        this.passKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobSecretsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DcAccessSecurityCodeResponse dcAccessSecurityCode;
        private List<DiskSecretResponse> diskSecrets;
        private CloudErrorResponse error;
        private Boolean isPasskeyUserDefined;
        private String jobSecretsType;
        private String passKey;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobSecretsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dcAccessSecurityCode = defaults.dcAccessSecurityCode;
    	      this.diskSecrets = defaults.diskSecrets;
    	      this.error = defaults.error;
    	      this.isPasskeyUserDefined = defaults.isPasskeyUserDefined;
    	      this.jobSecretsType = defaults.jobSecretsType;
    	      this.passKey = defaults.passKey;
        }

        public Builder setDcAccessSecurityCode(DcAccessSecurityCodeResponse dcAccessSecurityCode) {
            this.dcAccessSecurityCode = Objects.requireNonNull(dcAccessSecurityCode);
            return this;
        }

        public Builder setDiskSecrets(List<DiskSecretResponse> diskSecrets) {
            this.diskSecrets = Objects.requireNonNull(diskSecrets);
            return this;
        }

        public Builder setError(CloudErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setIsPasskeyUserDefined(Boolean isPasskeyUserDefined) {
            this.isPasskeyUserDefined = Objects.requireNonNull(isPasskeyUserDefined);
            return this;
        }

        public Builder setJobSecretsType(String jobSecretsType) {
            this.jobSecretsType = Objects.requireNonNull(jobSecretsType);
            return this;
        }

        public Builder setPassKey(String passKey) {
            this.passKey = Objects.requireNonNull(passKey);
            return this;
        }

        public DataBoxDiskJobSecretsResponse build() {
            return new DataBoxDiskJobSecretsResponse(dcAccessSecurityCode, diskSecrets, error, isPasskeyUserDefined, jobSecretsType, passKey);
        }
    }
}
