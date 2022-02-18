// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Virtual disk controller model
 * 
 */
public final class VirtualDiskControllerResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualDiskControllerResponse Empty = new VirtualDiskControllerResponse();

    /**
     * Controller's id
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The display name of Controller
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * dik controller subtype (VMWARE_PARAVIRTUAL, BUS_PARALLEL, LSI_PARALLEL, LSI_SAS)
     * 
     */
    @InputImport(name="subType", required=true)
    private final String subType;

    public String getSubType() {
        return this.subType;
    }

    /**
     * disk controller type (SCSI)
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public VirtualDiskControllerResponse(
        String id,
        String name,
        String subType,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.subType = Objects.requireNonNull(subType, "expected parameter 'subType' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private VirtualDiskControllerResponse() {
        this.id = null;
        this.name = null;
        this.subType = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDiskControllerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String subType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDiskControllerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.subType = defaults.subType;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSubType(String subType) {
            this.subType = Objects.requireNonNull(subType);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public VirtualDiskControllerResponse build() {
            return new VirtualDiskControllerResponse(id, name, subType, type);
        }
    }
}
