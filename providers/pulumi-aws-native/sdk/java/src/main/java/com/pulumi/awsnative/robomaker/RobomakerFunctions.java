// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.robomaker;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.robomaker.inputs.GetFleetArgs;
import com.pulumi.awsnative.robomaker.inputs.GetFleetPlainArgs;
import com.pulumi.awsnative.robomaker.inputs.GetRobotApplicationArgs;
import com.pulumi.awsnative.robomaker.inputs.GetRobotApplicationPlainArgs;
import com.pulumi.awsnative.robomaker.inputs.GetRobotApplicationVersionArgs;
import com.pulumi.awsnative.robomaker.inputs.GetRobotApplicationVersionPlainArgs;
import com.pulumi.awsnative.robomaker.inputs.GetRobotArgs;
import com.pulumi.awsnative.robomaker.inputs.GetRobotPlainArgs;
import com.pulumi.awsnative.robomaker.inputs.GetSimulationApplicationArgs;
import com.pulumi.awsnative.robomaker.inputs.GetSimulationApplicationPlainArgs;
import com.pulumi.awsnative.robomaker.inputs.GetSimulationApplicationVersionArgs;
import com.pulumi.awsnative.robomaker.inputs.GetSimulationApplicationVersionPlainArgs;
import com.pulumi.awsnative.robomaker.outputs.GetFleetResult;
import com.pulumi.awsnative.robomaker.outputs.GetRobotApplicationResult;
import com.pulumi.awsnative.robomaker.outputs.GetRobotApplicationVersionResult;
import com.pulumi.awsnative.robomaker.outputs.GetRobotResult;
import com.pulumi.awsnative.robomaker.outputs.GetSimulationApplicationResult;
import com.pulumi.awsnative.robomaker.outputs.GetSimulationApplicationVersionResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RobomakerFunctions {
    /**
     * AWS::RoboMaker::Fleet resource creates an AWS RoboMaker fleet. Fleets contain robots and can receive deployments.
     * 
     */
    public static Output<GetFleetResult> getFleet(GetFleetArgs args) {
        return getFleet(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::Fleet resource creates an AWS RoboMaker fleet. Fleets contain robots and can receive deployments.
     * 
     */
    public static CompletableFuture<GetFleetResult> getFleetPlain(GetFleetPlainArgs args) {
        return getFleetPlain(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::Fleet resource creates an AWS RoboMaker fleet. Fleets contain robots and can receive deployments.
     * 
     */
    public static Output<GetFleetResult> getFleet(GetFleetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:robomaker:getFleet", TypeShape.of(GetFleetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::Fleet resource creates an AWS RoboMaker fleet. Fleets contain robots and can receive deployments.
     * 
     */
    public static CompletableFuture<GetFleetResult> getFleetPlain(GetFleetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getFleet", TypeShape.of(GetFleetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::Robot resource creates an AWS RoboMaker Robot.
     * 
     */
    public static Output<GetRobotResult> getRobot(GetRobotArgs args) {
        return getRobot(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::Robot resource creates an AWS RoboMaker Robot.
     * 
     */
    public static CompletableFuture<GetRobotResult> getRobotPlain(GetRobotPlainArgs args) {
        return getRobotPlain(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::Robot resource creates an AWS RoboMaker Robot.
     * 
     */
    public static Output<GetRobotResult> getRobot(GetRobotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:robomaker:getRobot", TypeShape.of(GetRobotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::Robot resource creates an AWS RoboMaker Robot.
     * 
     */
    public static CompletableFuture<GetRobotResult> getRobotPlain(GetRobotPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getRobot", TypeShape.of(GetRobotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::RobotApplication resource creates an AWS RoboMaker RobotApplication. Robot application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static Output<GetRobotApplicationResult> getRobotApplication(GetRobotApplicationArgs args) {
        return getRobotApplication(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::RobotApplication resource creates an AWS RoboMaker RobotApplication. Robot application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static CompletableFuture<GetRobotApplicationResult> getRobotApplicationPlain(GetRobotApplicationPlainArgs args) {
        return getRobotApplicationPlain(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::RobotApplication resource creates an AWS RoboMaker RobotApplication. Robot application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static Output<GetRobotApplicationResult> getRobotApplication(GetRobotApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:robomaker:getRobotApplication", TypeShape.of(GetRobotApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::RobotApplication resource creates an AWS RoboMaker RobotApplication. Robot application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static CompletableFuture<GetRobotApplicationResult> getRobotApplicationPlain(GetRobotApplicationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getRobotApplication", TypeShape.of(GetRobotApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::RobotApplicationVersion resource creates an AWS RoboMaker RobotApplicationVersion. This helps you control which code your robot uses.
     * 
     */
    public static Output<GetRobotApplicationVersionResult> getRobotApplicationVersion(GetRobotApplicationVersionArgs args) {
        return getRobotApplicationVersion(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::RobotApplicationVersion resource creates an AWS RoboMaker RobotApplicationVersion. This helps you control which code your robot uses.
     * 
     */
    public static CompletableFuture<GetRobotApplicationVersionResult> getRobotApplicationVersionPlain(GetRobotApplicationVersionPlainArgs args) {
        return getRobotApplicationVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::RobotApplicationVersion resource creates an AWS RoboMaker RobotApplicationVersion. This helps you control which code your robot uses.
     * 
     */
    public static Output<GetRobotApplicationVersionResult> getRobotApplicationVersion(GetRobotApplicationVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:robomaker:getRobotApplicationVersion", TypeShape.of(GetRobotApplicationVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::RobotApplicationVersion resource creates an AWS RoboMaker RobotApplicationVersion. This helps you control which code your robot uses.
     * 
     */
    public static CompletableFuture<GetRobotApplicationVersionResult> getRobotApplicationVersionPlain(GetRobotApplicationVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getRobotApplicationVersion", TypeShape.of(GetRobotApplicationVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::SimulationApplication resource creates an AWS RoboMaker SimulationApplication. Simulation application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static Output<GetSimulationApplicationResult> getSimulationApplication(GetSimulationApplicationArgs args) {
        return getSimulationApplication(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::SimulationApplication resource creates an AWS RoboMaker SimulationApplication. Simulation application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static CompletableFuture<GetSimulationApplicationResult> getSimulationApplicationPlain(GetSimulationApplicationPlainArgs args) {
        return getSimulationApplicationPlain(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::SimulationApplication resource creates an AWS RoboMaker SimulationApplication. Simulation application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static Output<GetSimulationApplicationResult> getSimulationApplication(GetSimulationApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:robomaker:getSimulationApplication", TypeShape.of(GetSimulationApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::SimulationApplication resource creates an AWS RoboMaker SimulationApplication. Simulation application can be used in AWS RoboMaker Simulation Jobs.
     * 
     */
    public static CompletableFuture<GetSimulationApplicationResult> getSimulationApplicationPlain(GetSimulationApplicationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getSimulationApplication", TypeShape.of(GetSimulationApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::SimulationApplicationVersion resource creates an AWS RoboMaker SimulationApplicationVersion. This helps you control which code your simulation uses.
     * 
     */
    public static Output<GetSimulationApplicationVersionResult> getSimulationApplicationVersion(GetSimulationApplicationVersionArgs args) {
        return getSimulationApplicationVersion(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::SimulationApplicationVersion resource creates an AWS RoboMaker SimulationApplicationVersion. This helps you control which code your simulation uses.
     * 
     */
    public static CompletableFuture<GetSimulationApplicationVersionResult> getSimulationApplicationVersionPlain(GetSimulationApplicationVersionPlainArgs args) {
        return getSimulationApplicationVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * AWS::RoboMaker::SimulationApplicationVersion resource creates an AWS RoboMaker SimulationApplicationVersion. This helps you control which code your simulation uses.
     * 
     */
    public static Output<GetSimulationApplicationVersionResult> getSimulationApplicationVersion(GetSimulationApplicationVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:robomaker:getSimulationApplicationVersion", TypeShape.of(GetSimulationApplicationVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * AWS::RoboMaker::SimulationApplicationVersion resource creates an AWS RoboMaker SimulationApplicationVersion. This helps you control which code your simulation uses.
     * 
     */
    public static CompletableFuture<GetSimulationApplicationVersionResult> getSimulationApplicationVersionPlain(GetSimulationApplicationVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:robomaker:getSimulationApplicationVersion", TypeShape.of(GetSimulationApplicationVersionResult.class), args, Utilities.withVersion(options));
    }
}
