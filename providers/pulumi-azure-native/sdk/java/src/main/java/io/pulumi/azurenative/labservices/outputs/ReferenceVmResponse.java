// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.azurenative.labservices.outputs.VmStateDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReferenceVmResponse {
    /**
     * The password of the virtual machine. This will be set to null in GET resource API
     * 
     */
    private final @Nullable String password;
    /**
     * The username of the virtual machine
     * 
     */
    private final String userName;
    /**
     * VM resource Id for the environment
     * 
     */
    private final String vmResourceId;
    /**
     * The state details for the reference virtual machine.
     * 
     */
    private final VmStateDetailsResponse vmStateDetails;

    @OutputCustomType.Constructor({"password","userName","vmResourceId","vmStateDetails"})
    private ReferenceVmResponse(
        @Nullable String password,
        String userName,
        String vmResourceId,
        VmStateDetailsResponse vmStateDetails) {
        this.password = password;
        this.userName = Objects.requireNonNull(userName);
        this.vmResourceId = Objects.requireNonNull(vmResourceId);
        this.vmStateDetails = Objects.requireNonNull(vmStateDetails);
    }

    /**
     * The password of the virtual machine. This will be set to null in GET resource API
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The username of the virtual machine
     * 
    */
    public String getUserName() {
        return this.userName;
    }
    /**
     * VM resource Id for the environment
     * 
    */
    public String getVmResourceId() {
        return this.vmResourceId;
    }
    /**
     * The state details for the reference virtual machine.
     * 
    */
    public VmStateDetailsResponse getVmStateDetails() {
        return this.vmStateDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReferenceVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String userName;
        private String vmResourceId;
        private VmStateDetailsResponse vmStateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(ReferenceVmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
    	      this.vmResourceId = defaults.vmResourceId;
    	      this.vmStateDetails = defaults.vmStateDetails;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }

        public Builder setVmResourceId(String vmResourceId) {
            this.vmResourceId = Objects.requireNonNull(vmResourceId);
            return this;
        }

        public Builder setVmStateDetails(VmStateDetailsResponse vmStateDetails) {
            this.vmStateDetails = Objects.requireNonNull(vmStateDetails);
            return this;
        }
        public ReferenceVmResponse build() {
            return new ReferenceVmResponse(password, userName, vmResourceId, vmStateDetails);
        }
    }
}