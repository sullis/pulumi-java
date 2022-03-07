// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamPolicyState Empty = new DicomStoreIamPolicyState();

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="dicomStoreId")
      private final @Nullable Input<String> dicomStoreId;

    public Input<String> getDicomStoreId() {
        return this.dicomStoreId == null ? Input.empty() : this.dicomStoreId;
    }

    /**
     * (Computed) The etag of the DICOM store's IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    public DicomStoreIamPolicyState(
        @Nullable Input<String> dicomStoreId,
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData) {
        this.dicomStoreId = dicomStoreId;
        this.etag = etag;
        this.policyData = policyData;
    }

    private DicomStoreIamPolicyState() {
        this.dicomStoreId = Input.empty();
        this.etag = Input.empty();
        this.policyData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dicomStoreId;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
        }

        public Builder setDicomStoreId(@Nullable Input<String> dicomStoreId) {
            this.dicomStoreId = dicomStoreId;
            return this;
        }

        public Builder setDicomStoreId(@Nullable String dicomStoreId) {
            this.dicomStoreId = Input.ofNullable(dicomStoreId);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
            return this;
        }
        public DicomStoreIamPolicyState build() {
            return new DicomStoreIamPolicyState(dicomStoreId, etag, policyData);
        }
    }
}