// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.EntityReferenceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Package store for the SSIS integration runtime.
 * 
 */
public final class PackageStoreResponse extends io.pulumi.resources.InvokeArgs {

    public static final PackageStoreResponse Empty = new PackageStoreResponse();

    /**
     * The name of the package store
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The package store linked service reference.
     * 
     */
    @InputImport(name="packageStoreLinkedService", required=true)
    private final EntityReferenceResponse packageStoreLinkedService;

    public EntityReferenceResponse getPackageStoreLinkedService() {
        return this.packageStoreLinkedService;
    }

    public PackageStoreResponse(
        String name,
        EntityReferenceResponse packageStoreLinkedService) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.packageStoreLinkedService = Objects.requireNonNull(packageStoreLinkedService, "expected parameter 'packageStoreLinkedService' to be non-null");
    }

    private PackageStoreResponse() {
        this.name = null;
        this.packageStoreLinkedService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private EntityReferenceResponse packageStoreLinkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.packageStoreLinkedService = defaults.packageStoreLinkedService;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageStoreLinkedService(EntityReferenceResponse packageStoreLinkedService) {
            this.packageStoreLinkedService = Objects.requireNonNull(packageStoreLinkedService);
            return this;
        }

        public PackageStoreResponse build() {
            return new PackageStoreResponse(name, packageStoreLinkedService);
        }
    }
}
