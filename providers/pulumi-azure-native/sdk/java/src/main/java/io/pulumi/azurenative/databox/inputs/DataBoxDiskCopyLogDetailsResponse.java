// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Copy Log Details for a disk
 * 
 */
public final class DataBoxDiskCopyLogDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxDiskCopyLogDetailsResponse Empty = new DataBoxDiskCopyLogDetailsResponse();

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    @Import(name="copyLogDetailsType", required=true)
      private final String copyLogDetailsType;

    public String getCopyLogDetailsType() {
        return this.copyLogDetailsType;
    }

    /**
     * Disk Serial Number.
     * 
     */
    @Import(name="diskSerialNumber", required=true)
      private final String diskSerialNumber;

    public String getDiskSerialNumber() {
        return this.diskSerialNumber;
    }

    /**
     * Link for copy error logs.
     * 
     */
    @Import(name="errorLogLink", required=true)
      private final String errorLogLink;

    public String getErrorLogLink() {
        return this.errorLogLink;
    }

    /**
     * Link for copy verbose logs.
     * 
     */
    @Import(name="verboseLogLink", required=true)
      private final String verboseLogLink;

    public String getVerboseLogLink() {
        return this.verboseLogLink;
    }

    public DataBoxDiskCopyLogDetailsResponse(
        String copyLogDetailsType,
        String diskSerialNumber,
        String errorLogLink,
        String verboseLogLink) {
        this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType, "expected parameter 'copyLogDetailsType' to be non-null");
        this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber, "expected parameter 'diskSerialNumber' to be non-null");
        this.errorLogLink = Objects.requireNonNull(errorLogLink, "expected parameter 'errorLogLink' to be non-null");
        this.verboseLogLink = Objects.requireNonNull(verboseLogLink, "expected parameter 'verboseLogLink' to be non-null");
    }

    private DataBoxDiskCopyLogDetailsResponse() {
        this.copyLogDetailsType = null;
        this.diskSerialNumber = null;
        this.errorLogLink = null;
        this.verboseLogLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskCopyLogDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String copyLogDetailsType;
        private String diskSerialNumber;
        private String errorLogLink;
        private String verboseLogLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskCopyLogDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyLogDetailsType = defaults.copyLogDetailsType;
    	      this.diskSerialNumber = defaults.diskSerialNumber;
    	      this.errorLogLink = defaults.errorLogLink;
    	      this.verboseLogLink = defaults.verboseLogLink;
        }

        public Builder copyLogDetailsType(String copyLogDetailsType) {
            this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType);
            return this;
        }
        public Builder diskSerialNumber(String diskSerialNumber) {
            this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber);
            return this;
        }
        public Builder errorLogLink(String errorLogLink) {
            this.errorLogLink = Objects.requireNonNull(errorLogLink);
            return this;
        }
        public Builder verboseLogLink(String verboseLogLink) {
            this.verboseLogLink = Objects.requireNonNull(verboseLogLink);
            return this;
        }        public DataBoxDiskCopyLogDetailsResponse build() {
            return new DataBoxDiskCopyLogDetailsResponse(copyLogDetailsType, diskSerialNumber, errorLogLink, verboseLogLink);
        }
    }
}
