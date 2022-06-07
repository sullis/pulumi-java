// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFilePlainArgs Empty = new GetFilePlainArgs();

    /**
     * Name of the File
     * 
     */
    @Import(name="fileName", required=true)
    private String fileName;

    /**
     * @return Name of the File
     * 
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Name of the resource group
     * 
     */
    @Import(name="groupName", required=true)
    private String groupName;

    /**
     * @return Name of the resource group
     * 
     */
    public String groupName() {
        return this.groupName;
    }

    /**
     * Name of the project
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    /**
     * @return Name of the project
     * 
     */
    public String projectName() {
        return this.projectName;
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return Name of the service
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    private GetFilePlainArgs() {}

    private GetFilePlainArgs(GetFilePlainArgs $) {
        this.fileName = $.fileName;
        this.groupName = $.groupName;
        this.projectName = $.projectName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFilePlainArgs $;

        public Builder() {
            $ = new GetFilePlainArgs();
        }

        public Builder(GetFilePlainArgs defaults) {
            $ = new GetFilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileName Name of the File
         * 
         * @return builder
         * 
         */
        public Builder fileName(String fileName) {
            $.fileName = fileName;
            return this;
        }

        /**
         * @param groupName Name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param projectName Name of the project
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param serviceName Name of the service
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetFilePlainArgs build() {
            $.fileName = Objects.requireNonNull($.fileName, "expected parameter 'fileName' to be non-null");
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
